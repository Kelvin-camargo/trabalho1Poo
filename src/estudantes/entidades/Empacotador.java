package estudantes.entidades;

import Produtos.Alimenticio;
import Produtos.CuidadosPessoais;
import Produtos.Eletroeletronico;
import Produtos.Limpeza;
import professor.entidades.Caixa;
import professor.entidades.Fiscal;
import professor.entidades.Sacola;
import refigerado.Refrigerado;

/**
 * Classe que traz a lógica do algoritmo de "ensacolamento" dos produtos.
 * <br><br>
 * Você pode incluir novos atributos e métodos nessa classe para criar
 * lógicas mais complexas para o gerenciamento empacotamento de produtos, 
 * mas esses <strong>atributos e métodos devem ser todos privados</strong>. 
 * O único método público deve ser "agir".
 * 
 * @author Jean Cheiran
 * @version 1.0
 */
public class Empacotador {
    
    public int proximoCaixa = 1; //usada para saber para onde o empacotador deve ir
    
    /**
     * Executa a lógica de empacotamento e troca de caixa.
     * Esse método é o único método de controle invocado durante a simulação 
     * do supermercado.
     * <br><br>
     * Aqui podem ser feitas todas as verificações sobre os produtos no monte e
     * nas sacolas do caixa em que o empacotador está. A partir dessas informações,
     * você pode colocar produtos do monte daquele caixa em sacolas e despachar
     * sacolas para o fiscal.
     * <br><br>
     * O atributo "proximoCaixa" é usado pelo simulador para mover o empacotador
     * para outro caixa (ou permanecer no mesmo se ele quiser), ou seja, o
     * empacotador sempre vai para o caixa do número indicado nesse atributo 
     * após um ciclo de simulação.
     * <br><br>
     * <strong>O empacotador não pode levar produtos com ele</strong> de um  
     * caixa para outro, ou seja, você não deve criar atributos com vetores, 
     * matrizes ou coleções (ArrayList, HashSet etc.) de produtos.
     * @param caixa o caixa onde está o empacotador
     * @param fiscal fiscal que pode ser consultado sobre as sacolas despachadas
     */
    public void agir(Caixa caixa, Fiscal fiscal) {
        // Verifica se há produtos no monte
        if (caixa.contarProdutosNoMonte() == 0) {
            // Se não há produtos, avança para o próximo caixa
            proximoCaixa++;
            return;
        }

        // Obtém a primeira sacola disponível
        Sacola sacolaAtual = caixa.getSacola(1);

        // Obtém todos os produtos do monte
        Produto[] produtosNoMonte = caixa.getArrayDoMonte();

        // Loop através dos produtos no monte
        for (Produto produto : produtosNoMonte) {
            // Verifica se o produto não é nulo
            if (produto != null) {
                // Verifica se a sacola atual não excederá o peso máximo
                if (sacolaAtual.contarProdutosNaSacola() + produto.getPeso() > 5000) {
                    // Se exceder, substitui a sacola e começa uma nova
                    sacolaAtual = new Sacola(); // Cria uma nova sacola
                    caixa.reporSacolas(); // Reabastece a sacola no caixa
                    continue; // Retorna para o loop
                }

                // Verifica se o produto pode ser adicionado à sacola atual
                if (!podeAdicionarNaSacola(sacolaAtual, produto)) {
                    // Se não puder, substitui a sacola e começa uma nova
                    sacolaAtual = new Sacola(); // Cria uma nova sacola
                    caixa.reporSacolas(); // Reabastece a sacola no caixa
                    continue; // Retorna para o loop
                }

                // Adiciona o produto à sacola
                sacolaAtual.colocarProdutoNaSacola(produto);
                caixa.pegarProdutoDoMonte(produto); // Retira o produto do monte
            }

            // Verifica se a sacola está cheia o suficiente para despachar
            if (sacolaAtual.contarProdutosNaSacola() >= 1000) {
                caixa.despacharSacola(1); // Despacha a sacola atual
                caixa.reporSacolas(); // Reabastece as sacolas
                sacolaAtual = caixa.getSacola(1); // Obtém uma nova sacola
            }
        }

        // Após o loop, verifica se ainda há produtos na sacola
        if (sacolaAtual.contarProdutosNaSacola() > 0) {
            caixa.despacharSacola(1); // Despacha a sacola restante, se houver produtos
            caixa.reporSacolas(); // Reabastece as sacolas
        }

        // Atualiza o próximo caixa
        proximoCaixa++;
    }

    // Método auxiliar para verificar se um produto pode ser adicionado à sacola
    private boolean podeAdicionarNaSacola(Sacola sacola, Produto produto) {
        // Verifica o tipo do produto e as regras de combinação
        for (Produto p : sacola.getArrayDaSacola()) {
            if (p instanceof CuidadosPessoais && produto instanceof Alimenticio) {
                return false; // Não pode misturar
            }
            if (p instanceof Limpeza && (produto instanceof Alimenticio || produto instanceof Eletroeletronico || produto instanceof CuidadosPessoais)) {
                return false; // Não pode misturar
            }
            if (p instanceof Refrigerado) {
                if (!(produto instanceof Refrigerado)) {
                    return false; // Não pode misturar com produtos não refrigerados
                }
                Refrigerado pRefrigerado = (Refrigerado) p;
                Refrigerado produtoRefrigerado = (Refrigerado) produto;
                if (Math.abs(pRefrigerado.getTemperaturaIdeal() - produtoRefrigerado.getTemperaturaIdeal()) > 15) {
                    return false; // Diferença de temperatura muito grande
                }
            }
        }
        return true; // Pode adicionar o produto
    }
}

package estudantes.entidades;

/**
 * Classe que define um produto no supermercado.
 * <br><br>
 * Essa classe pode ser estendida. Adicionalmente, ela deve:
 * <br><br>
 * 1) ter um construtor completo,<br>
 * 2) implementar métodos de acesso (getters), sendo que métodos de modificação
 * (setters) NÃO devem ser implementados,<br>
 * 3) sobre-escrever os métodos toString, equals e hashCode,<br>
 * 4) ter um JavaDoc útil e completo.
 * <br><br>
 * <strong>Não devem ser criados métodos adicionais nessa classe.</strong>
 * 
 * @author Jean Cheiran
 * @version 1.0
 */
/**
 * Classe que define um produto no supermercado.
 * <br><br>
 * Essa classe pode ser estendida. Adicionalmente, ela deve:
 * <br><br>
 * 1) Ter um construtor completo,<br>
 * 2) Implementar métodos de acesso (getters), sendo que métodos de modificação
 * (setters) NÃO devem ser implementados,<br>
 * 3) Sobrescrever os métodos toString, equals e hashCode,<br>
 * 4) Ter um JavaDoc útil e completo.
 * <br><br>
 * <strong>Não devem ser criados métodos adicionais nessa classe.</strong>
 */
public class Produto {
    private int codigo;
    private String nome;
    private String fabricante;
    private int peso;  // Peso em gramas

    /**
     * Construtor completo da classe Produto.
     *
     * @param codigo Código identificador do produto
     * @param nome Nome do produto
     * @param fabricante Nome do fabricante do produto
     * @param peso Peso do produto em gramas
     */
    public Produto(int codigo, String nome, String fabricante, int peso) {
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.peso = peso;
    }

    /**
     * Retorna o código do produto.
     *
     * @return código do produto
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Retorna o nome do produto.
     *
     * @return nome do produto
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o nome do fabricante do produto.
     *
     * @return nome do fabricante do produto
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Retorna o peso do produto em gramas.
     *
     * @return peso do produto
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Retorna uma representação textual do objeto Produto.
     *
     * @return string representando o objeto Produto
     */
    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", peso=" + peso +
                '}';
    }

    /**
     * Gera um código hash para o objeto Produto.
     *
     * @return código hash baseado no código do produto
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(codigo);
    }

    /**
     * Compara este produto com outro objeto.
     *
     * @param o o objeto a ser comparado
     * @return true se os produtos tiverem o mesmo código, caso contrário false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }
}

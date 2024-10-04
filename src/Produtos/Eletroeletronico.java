package Produtos;

import estudantes.entidades.Produto;

public class Eletroeletronico extends Produto {
    private short tensao;  // Atributo específico de tensão (voltagem)

    // Construtor
    public Eletroeletronico(int codigo, String nome, String fabricante, int peso, short tensao) {
        super(codigo, nome, fabricante, peso);  // Chama o construtor da classe pai (Produto)
        this.tensao = tensao;  // Inicializa o atributo tensao
    }

    // Getter para o atributo tensao
    public short getTensao() {
        return tensao;
    }

    // Sobrescrevendo o método toString()
    @Override
    public String toString() {
        return "Eletroeletronico{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", fabricante='" + getFabricante() + '\'' +
                ", peso=" + getPeso() +
                ", tensao=" + tensao + "V" +
                '}';
    }

    // Sobrescrevendo o método hashCode()
    @Override
    public int hashCode() {
        return super.hashCode() + Short.hashCode(tensao);  // Inclui o hashCode de tensao além do hashCode da classe Produto
    }

    // Sobrescrevendo o método equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Eletroeletronico)) return false;  // Verifica se é da classe Eletroeletronico
        if (!super.equals(o)) return false;  // Verifica igualdade dos atributos herdados

        Eletroeletronico that = (Eletroeletronico) o;
        return tensao == that.tensao;  // Compara o atributo tensao
    }
}

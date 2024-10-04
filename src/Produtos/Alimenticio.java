package Produtos;

import estudantes.entidades.Produto;

public class Alimenticio extends Produto {
    private long validade;  // Validade do produto (em timestamp ou outro formato numérico)

    // Construtor
    public Alimenticio(int codigo, String nome, String fabricante, int peso, long validade) {
        super(codigo, nome, fabricante, peso);  // Chama o construtor da classe pai (Produto)
        this.validade = validade;  // Inicializa o atributo validade
    }

    // Getter para o atributo validade
    public long getValidade() {
        return validade;
    }

    // Sobrescrevendo o método toString()
    @Override
    public String toString() {
        return "Alimenticio{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", fabricante='" + getFabricante() + '\'' +
                ", peso=" + getPeso() +
                ", validade=" + validade +
                '}';
    }

    // Sobrescrevendo o método hashCode()
    @Override
    public int hashCode() {
        return super.hashCode() + Long.hashCode(validade);  // Inclui o hashCode de validade além do hashCode da classe Produto
    }

    // Sobrescrevendo o método equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alimenticio)) return false;  // Verifica se é da classe Alimenticio
        if (!super.equals(o)) return false;  // Verifica igualdade dos atributos herdados

        Alimenticio that = (Alimenticio) o;
        return validade == that.validade;  // Compara o atributo validade
    }
}


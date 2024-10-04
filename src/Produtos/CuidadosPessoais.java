package Produtos;

import estudantes.entidades.Produto;

public class CuidadosPessoais extends Produto {
    private long validade;   // Validade do produto em formato long (timestamp)
    private String fragrancia;  // Fragrância do produto

    // Construtor completo
    public CuidadosPessoais(int codigo, String nome, String fabricante, int peso, long validade, String fragrancia) {
        super(codigo, nome, fabricante, peso);  // Chama o construtor da classe Produto
        this.validade = validade;
        this.fragrancia = fragrancia;
    }

    // Getter para validade
    public long getValidade() {
        return validade;
    }

    // Getter para fragrância
    public String getFragrancia() {
        return fragrancia;
    }

    // Sobrescrevendo o método toString()
    @Override
    public String toString() {
        return "CuidadosPessoais{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", fabricante='" + getFabricante() + '\'' +
                ", peso=" + getPeso() +
                ", validade=" + validade +
                ", fragrancia='" + fragrancia + '\'' +
                '}';
    }

    // Sobrescrevendo o método hashCode()
    @Override
    public int hashCode() {
        return super.hashCode() + Long.hashCode(validade) + fragrancia.hashCode();
    }

    // Sobrescrevendo o método equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CuidadosPessoais)) return false;
        if (!super.equals(o)) return false;

        CuidadosPessoais that = (CuidadosPessoais) o;
        return validade == that.validade && fragrancia.equals(that.fragrancia);
    }
}

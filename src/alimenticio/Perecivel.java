package alimenticio;

import Produtos.Alimenticio;

public class Perecivel extends Alimenticio {

    // Construtor
    public Perecivel(int codigo, String nome, String fabricante, int peso, long validade) {
        super(codigo, nome, fabricante, peso, validade);  // Chama o construtor da classe pai (Alimenticio)
    }

    // Sobrescrevendo o método toString()
    @Override
    public String toString() {
        return "Perecivel{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", fabricante='" + getFabricante() + '\'' +
                ", peso=" + getPeso() +
                ", validade=" + getValidade() +
                '}';
    }

    // Sobrescrevendo o método hashCode()
    @Override
    public int hashCode() {
        return super.hashCode();  // Utiliza o hashCode da classe Alimenticio
    }

    // Sobrescrevendo o método equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Perecivel)) return false;  // Verifica se é da classe Perecivel
        return super.equals(o);  // Compara usando a lógica da classe Alimenticio
    }
}

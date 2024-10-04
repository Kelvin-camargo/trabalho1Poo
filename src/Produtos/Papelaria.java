package Produtos;

import estudantes.entidades.Produto;

public class Papelaria extends Produto {
    
    // Construtor
    public Papelaria(int codigo, String nome, String fabricante, int peso) {
        super(codigo, nome, fabricante, peso);  // Chama o construtor da classe pai (Produto)
    }

    // Sobrescrevendo o método toString()
    @Override
    public String toString() {
        return "Papelaria{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", fabricante='" + getFabricante() + '\'' +
                ", peso=" + getPeso() +
                '}';
    }

    // Sobrescrevendo o método hashCode()
    @Override
    public int hashCode() {
        return super.hashCode();  // Utiliza o hashCode da classe Produto
    }

    // Sobrescrevendo o método equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Papelaria)) return false;  // Verifica se é da classe Papelaria
        return super.equals(o);  // Compara com base na lógica de Produto (código)
    }
}

package Produtos;

import estudantes.entidades.Produto;

public class Limpeza extends Produto {

    // Construtor completo
    public Limpeza(int codigo, String nome, String fabricante, int peso) {
        super(codigo, nome, fabricante, peso);  // Chama o construtor da classe Produto
    }

    // Sobrescrevendo o método toString()
    @Override
    public String toString() {
        return "Limpeza{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", fabricante='" + getFabricante() + '\'' +
                ", peso=" + getPeso() +
                '}';
    }

    // Sobrescrevendo o método hashCode()
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // Sobrescrevendo o método equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Limpeza)) return false;
        return super.equals(o);  // Verifica igualdade com base nos atributos herdados de Produto
    }
}

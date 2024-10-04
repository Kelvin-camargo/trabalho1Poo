package cuidadospessoais;

import Produtos.CuidadosPessoais;

public class Higiene extends CuidadosPessoais {

    // Construtor completo
    public Higiene(int codigo, String nome, String fabricante, int peso, long validade, String fragrancia) {
        super(codigo, nome, fabricante, peso, validade, fragrancia);  // Chama o construtor da classe CuidadosPessoais
    }

    // Sobrescrevendo o método toString()
    @Override
    public String toString() {
        return "Higiene{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", fabricante='" + getFabricante() + '\'' +
                ", peso=" + getPeso() +
                ", validade=" + getValidade() +
                ", fragrancia='" + getFragrancia() + '\'' +
                '}';
    }

    // Sobrescrevendo o método hashCode()
    @Override
    public int hashCode() {
        return super.hashCode();  // Usa o hashCode da classe CuidadosPessoais
    }

    // Sobrescrevendo o método equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Higiene)) return false;  // Verifica se é da classe Higiene
        return super.equals(o);  // Verifica igualdade com base nos atributos herdados de CuidadosPessoais
    }
}

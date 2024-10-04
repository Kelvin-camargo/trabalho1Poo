package cuidadospessoais;

import Produtos.CuidadosPessoais;

public class Cosmetico extends CuidadosPessoais {
    private char tipoDePele;  // Tipo de pele (por exemplo: 'N' para Normal, 'S' para Sensível, 'G' para Gordurosa)

    // Construtor completo
    public Cosmetico(int codigo, String nome, String fabricante, int peso, long validade, String fragrancia, char tipoDePele) {
        super(codigo, nome, fabricante, peso, validade, fragrancia);  // Chama o construtor da classe CuidadosPessoais
        this.tipoDePele = tipoDePele;  // Inicializa o atributo tipoDePele
    }

    // Getter para tipoDePele
    public char getTipoDePele() {
        return tipoDePele;
    }

    // Sobrescrevendo o método toString()
    @Override
    public String toString() {
        return "Cosmetico{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", fabricante='" + getFabricante() + '\'' +
                ", peso=" + getPeso() +
                ", validade=" + getValidade() +
                ", fragrancia='" + getFragrancia() + '\'' +
                ", tipoDePele=" + tipoDePele +
                '}';
    }

    // Sobrescrevendo o método hashCode()
    @Override
    public int hashCode() {
        return super.hashCode() + Character.hashCode(tipoDePele);  // Usa o hashCode da classe CuidadosPessoais e inclui o tipoDePele
    }

    // Sobrescrevendo o método equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cosmetico)) return false;  // Verifica se é da classe Cosmetico
        if (!super.equals(o)) return false;  // Verifica igualdade com base nos atributos herdados

        Cosmetico that = (Cosmetico) o;
        return tipoDePele == that.tipoDePele;  // Compara o atributo tipoDePele
    }
}

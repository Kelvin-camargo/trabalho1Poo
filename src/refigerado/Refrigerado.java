package refigerado;

import alimenticio.Perecivel;

public class Refrigerado extends Perecivel {
    private int temperaturaIdeal;  // Temperatura ideal de armazenamento (em graus Celsius)

    // Construtor
    public Refrigerado(int codigo, String nome, String fabricante, int peso, long validade, int temperaturaIdeal) {
        super(codigo, nome, fabricante, peso, validade);  // Chama o construtor da classe pai (Perecivel)
        this.temperaturaIdeal = temperaturaIdeal;  // Inicializa o atributo temperaturaIdeal
    }

    // Getter para o atributo temperaturaIdeal
    public int getTemperaturaIdeal() {
        return temperaturaIdeal;
    }

    // Sobrescrevendo o método toString()
    @Override
    public String toString() {
        return "Refrigerado{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", fabricante='" + getFabricante() + '\'' +
                ", peso=" + getPeso() +
                ", validade=" + getValidade() +
                ", temperaturaIdeal=" + temperaturaIdeal + "°C" +
                '}';
    }

    // Sobrescrevendo o método hashCode()
    @Override
    public int hashCode() {
        return super.hashCode() + Integer.hashCode(temperaturaIdeal);  // Inclui o hashCode de temperaturaIdeal
    }

    // Sobrescrevendo o método equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerado)) return false;  // Verifica se é da classe Refrigerado
        if (!super.equals(o)) return false;  // Verifica igualdade dos atributos herdados

        Refrigerado that = (Refrigerado) o;
        return temperaturaIdeal == that.temperaturaIdeal;  // Compara o atributo temperaturaIdeal
    }
}

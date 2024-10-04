package alimenticio;

import Produtos.Alimenticio;

public class NaoPerecivel extends Alimenticio {
    private String tipoDeArmazenamento;  // Tipo de armazenamento (por exemplo: "seco", "refrigerado", "congelado")

    // Construtor
    public NaoPerecivel(int codigo, String nome, String fabricante, int peso, long validade, String tipoDeArmazenamento) {
        super(codigo, nome, fabricante, peso, validade);  // Chama o construtor da classe pai (Alimenticio)
        this.tipoDeArmazenamento = tipoDeArmazenamento;   // Inicializa o atributo tipoDeArmazenamento
    }

    // Getter para o atributo tipoDeArmazenamento
    public String getTipoDeArmazenamento() {
        return tipoDeArmazenamento;
    }

    // Sobrescrevendo o método toString()
    @Override
    public String toString() {
        return "NaoPerecivel{" +
                "codigo=" + getCodigo() +
                ", nome='" + getNome() + '\'' +
                ", fabricante='" + getFabricante() + '\'' +
                ", peso=" + getPeso() +
                ", validade=" + getValidade() +
                ", tipoDeArmazenamento='" + tipoDeArmazenamento + '\'' +
                '}';
    }

    // Sobrescrevendo o método hashCode()
    @Override
    public int hashCode() {
        return super.hashCode() + tipoDeArmazenamento.hashCode();  // Inclui o hashCode de tipoDeArmazenamento
    }

    // Sobrescrevendo o método equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NaoPerecivel)) return false;  // Verifica se é da classe NaoPerecivel
        if (!super.equals(o)) return false;  // Verifica igualdade dos atributos herdados

        NaoPerecivel that = (NaoPerecivel) o;
        return tipoDeArmazenamento.equals(that.tipoDeArmazenamento);  // Compara o atributo tipoDeArmazenamento
    }
}

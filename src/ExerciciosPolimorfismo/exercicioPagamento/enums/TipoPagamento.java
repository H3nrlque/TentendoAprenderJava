package ExerciciosPolimorfismo.exercicioPagamento.enums;

public enum TipoPagamento {
    CREDITO("Credito"), DEBITO("Debito"), PIX("Pix");

    private String tipo;

    TipoPagamento(String tipo) {
        this.tipo = tipo;
    }

    public static TipoPagamento tipoPagamento(String tipo) {
        for (TipoPagamento tipoPagamento : values()) {
            if (tipoPagamento.getTipo().equals(tipo)) {
                return tipoPagamento;
            }
        }
        return null;
    }

    public String getTipo() {
        return tipo;
    }


}

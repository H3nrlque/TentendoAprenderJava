package ListaExerciciosDio.ExercicioPagamento.enums;

public enum TipoPagamento {
    CREDITO(1 ,"Crédito"),
    DEBITO(2, "Débito"),
    DINHEIRO_OU_PIX(3, "Dinheiro"),
    CREDITO_PARCELADO_EM_2(4, "Credito parcelado em 2"),
    CREDITO_PARCELADO_EM_3_OU_MAIS(5, "Crédito parcelado em 3 vezes ou mais");

    private final int valor;
    private final String tipoPagamento;

    TipoPagamento(int valor, String tipoPagamento) {
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    public static int tipoPagamentoPorNome(String tipoPagamento) {
        for (TipoPagamento pagamento : values()) {
            if(pagamento.tipoPagamento.equals(tipoPagamento)) {
                return pagamento.valor;
            }
        }
        return 0;
    }
}

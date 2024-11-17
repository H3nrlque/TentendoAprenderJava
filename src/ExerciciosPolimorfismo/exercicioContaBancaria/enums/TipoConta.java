package ExerciciosPolimorfismo.exercicioContaBancaria.enums;

public enum TipoConta {
    CONTA_CORRENTE("Conta Corrente"),
    CONTA_POUPANCA("Conta Poupança");

    private String tipoConta;

    TipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public static TipoConta tipoDeConta(String tipoConta) {
        for (TipoConta conta : TipoConta.values()) {
            if (conta.getTipoConta().equals(tipoConta)) {
                return conta;
            }
        }
        return null;
    }


    public String getTipoConta() {
        return tipoConta;
    }
}

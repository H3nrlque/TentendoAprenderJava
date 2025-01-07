package OutraListaDeExercicios.ExercicioComEnumEHeranca.dominio;

public enum TipoConta {
    CORRENTE("Corrente"), POUPANCA("Poupança");

    private String tipo;

    TipoConta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public static TipoConta tipoConta(String nome) {
        for (TipoConta tipoConta : values()) {
            if (tipoConta.tipo.equals(nome)) {
                return tipoConta;
            }
        }
        return null;
    }

    public static ContaBancaria instaciarConta(String nome, String cpf, String tipoConta) {
        TipoConta tipoConta1 = TipoConta.tipoConta(tipoConta);
        if (tipoConta1 != null && tipoConta1.getTipo().equals("Corrente")) {
            return new ContaCorrente(nome, cpf);
        } else {
            return new Poupanca(nome, cpf);
        }
    }
}

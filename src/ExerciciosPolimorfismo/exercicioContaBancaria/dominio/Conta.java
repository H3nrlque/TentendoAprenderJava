package ExerciciosPolimorfismo.exercicioContaBancaria.dominio;

public abstract class Conta implements Sacar, Depositar {
    protected String numeroConta;
    protected double saldo;

    public Conta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}

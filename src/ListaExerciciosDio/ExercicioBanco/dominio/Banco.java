package ListaExerciciosDio.ExercicioBanco.dominio;


import ListaExerciciosDio.ExercicioBanco.interfaces.Operacoes;

public abstract class Banco implements Operacoes {
    protected String titular;
    protected String numeroConta;
    protected double saldo;


    public Banco(String titular, String numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}

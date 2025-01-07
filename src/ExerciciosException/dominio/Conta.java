package ExerciciosException.dominio;

public class Conta {
    private Titular titular;
    private String numeroConta;
    private double saldo;

    public Conta(Titular titular, String numeroConta ) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public Conta(Titular titular, String numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        System.out.println("Realizando depósito");
        saldo += valor;
        System.out.println("Depósito realizado com sucesso");
        System.out.println("Saldo Atual: R$ "+saldo);
    }

    public void saque(double valor) throws SaldoInsuficienteException {
        if (valor <= saldo && saldo != 0) {
            System.out.println("Realizano saque...");
            saldo -= valor;
            System.out.println("saque realizado com sucesso");
            System.out.println("Saldo Atual: R$ "+saldo);
        } else {
            throw new SaldoInsuficienteException();
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}

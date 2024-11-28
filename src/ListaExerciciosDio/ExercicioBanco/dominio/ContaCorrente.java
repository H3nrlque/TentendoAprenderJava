package ListaExerciciosDio.ExercicioBanco.dominio;

public class ContaCorrente extends Banco{
    public ContaCorrente(String titular, String numeroConta) {
        super(titular, numeroConta);
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
        }
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso");
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }
    }

    @Override
    public double saldoAtual() {
        return this.saldo;
    }
}

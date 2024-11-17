package ExerciciosPolimorfismo.exercicioContaBancaria.dominio;

public class ContaCorrente extends Conta {
    public ContaCorrente(String numeroConta) {
        super(numeroConta);
    }

    @Override
    public void depositar(double valor) {
        if (valor < 1) {
            return;
        }
         this.saldo = valor;
        System.out.println("Depósito realizado com sucesso");
    }

    @Override
    public void sacar(double valor) {
        if (saldo <= 0) {
            System.out.println("Você não possui saldo na conta");
            return;
        }
        this.saldo = (saldo - valor) - 1;
        System.out.println("Saque realizado com sucesso");
    }
}

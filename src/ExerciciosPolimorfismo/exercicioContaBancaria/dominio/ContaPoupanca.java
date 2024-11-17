package ExerciciosPolimorfismo.exercicioContaBancaria.dominio;

public class ContaPoupanca extends Conta{
    private int contadorDeSaques;

    public ContaPoupanca(String numeroConta) {
        super(numeroConta);
    }

    @Override
    public void depositar(double valor) {
         this.saldo = valor;
    }

    @Override
    public void sacar(double valor) {
        if (saldo == 0) {
            System.out.println("Você não tem saldo na conta");
            return;
        }
        if (contadorDeSaques < 3) {
            this.saldo = saldo - valor;
            contadorDeSaques++;
        } else {
            this.saldo = (saldo - valor) - 2;
        }

    }
}

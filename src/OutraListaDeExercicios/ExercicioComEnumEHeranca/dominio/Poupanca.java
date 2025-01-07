package OutraListaDeExercicios.ExercicioComEnumEHeranca.dominio;

public class Poupanca extends ContaBancaria{
    public Poupanca() {
    }

    public Poupanca(String nome, String cpf) {
        super(nome, cpf);
    }

    public Poupanca(String nome, String cpf, double saldo) {
        super(nome, cpf, saldo);
    }

    @Override
    public void saque(double valor) {
        this.saldo -= valor - 5;
    }

    @Override
    public void deposito(double valor) {
        this.saldo += valor;
    }
}

package OutraListaDeExercicios.ExercicioComEnumEHeranca.dominio;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente() {
    }

    public ContaCorrente(String nome, String cpf) {
        super(nome, cpf);
    }

    public ContaCorrente(String nome, String cpf, double saldo) {
        super(nome, cpf, saldo);
    }

    @Override
    public void saque(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    @Override
    public void deposito(double valor) {
        this.saldo += valor;
    }
}

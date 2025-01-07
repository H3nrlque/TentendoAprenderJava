package OutraListaDeExercicios.ExercicioComEnumEHeranca.dominio;

public abstract class ContaBancaria implements Operacoes {
    protected String nome;
    protected String cpf;
    protected double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public ContaBancaria(String nome, String cpf, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }
}

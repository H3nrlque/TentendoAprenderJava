package ExerciciosParte02.dominio;

public class ContaBancaria {
        private String agencia;
        private String numeroConta;
        private Cliente cliente;

    public ContaBancaria(String agencia, String numeroConta) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void adicionarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Agência: "+this.agencia+"\n"
                +"Numero da conta: "+numeroConta+"\n";
    }

    public void imprime() {
        System.out.println("Agência: "+this.agencia);
        System.out.println("Número da conta: "+this.numeroConta);
        System.out.println("Cliente: \n"+cliente);
    }
}

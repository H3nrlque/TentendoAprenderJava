package ListaExerciciosDio.SistemaRestaurante.dominio;

public class Cliente {
    private String nome;
    private Pedido pedido;
    private double conta;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public double getConta() {
        return conta;
    }

    public void pedidoCliente(Pedido pedido) {
        this.pedido = pedido;
    }

    public void valorConta() {
        this.conta = pedido.valorPedido();
    }

    public void removerPedido() {
        this.pedido = null;
    }
}

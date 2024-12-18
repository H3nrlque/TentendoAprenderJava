package ListaExerciciosDio.SistemaRestaurante.dominio;

public class Cliente {
    private String nome;
    private Pedido pedido;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void pedidoCliente(Pedido pedido) {
        this.pedido = pedido;
    }

    public void removerPedido() {
        this.pedido = null;
    }
}

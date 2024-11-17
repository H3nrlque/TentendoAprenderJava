package ExerciciosMaisCompletos.SistemaRestaurante.dominio;

public class PedidoOnline extends Pedido implements Entregavel {
    @Override
    public void entregar(String endereco) {
        System.out.println("Endereço de entrega: "+endereco);
    }

    @Override
    public String toString() {
        return "PedidoOnline{" +
                "produtos=" + produtos;
    }
}


package ListaExerciciosDio.SistemaRestaurante.dominio;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nomeRestaurante;
    private List<Pedido> pedidos = new ArrayList<>();
    private Cardapio cardapio;

    public Restaurante(String nomeRestaurante, Cardapio cardapio) {
        this.nomeRestaurante = nomeRestaurante;
        this.cardapio = cardapio;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
        pedido.getCliente().pedidoCliente(pedido);
    }

    public void removerPedido(String nome) {
        for (Pedido pedido : pedidos) {
            if (pedido.getCliente().getNome().equals(nome)) {
                pedido.getCliente().removerPedido();
                pedidos.remove(pedido);
            }
        }
    }

    public void exibirPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    public void exibirCardapio() {
        for (Prato prato : cardapio.getPratos()) {
            System.out.println(prato);
        }

    }


}

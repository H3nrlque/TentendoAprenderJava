package ExerciciosMaisCompletos.SistemaRestaurante.servico;

import ExerciciosMaisCompletos.SistemaRestaurante.dominio.PedidoOnline;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<PedidoOnline> pedidoOnlines = new ArrayList<>();

    public Restaurante(PedidoOnline pedidoOnline) {
        adicionarPedido(pedidoOnline);
    }

    public void adicionarPedido(PedidoOnline pedidoOnline) {
        if (pedidoOnlines.contains(pedidoOnline)) {
            return;
        }
        pedidoOnlines.add(pedidoOnline);
    }

    public void mostrarTotal() {
        for (int i = 0; i < pedidoOnlines.size(); i++) {
            System.out.println("Pedido "+(i+1)+": R$ "+pedidoOnlines.get(i).calcularTotal());
        }
    }

    public void entregarPedidosOnline(String endereco) {
        for (PedidoOnline pedidoOnline : pedidoOnlines) {
            pedidoOnline.entregar(endereco);
            System.out.println("produtos: "+pedidoOnline.getProdutos());
            System.out.println("Total: R$ "+pedidoOnline.getTotal());
            System.out.println("--------");
        }
    }

    public void listarPedidos() {
        for (PedidoOnline pedidoOnline : pedidoOnlines) {
            System.out.println(pedidoOnline);
        }

    }
}

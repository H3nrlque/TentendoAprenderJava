package ExerciciosMaisCompletos.SistemaRestaurante.teste;

import ExerciciosMaisCompletos.SistemaRestaurante.dominio.PedidoOnline;
import ExerciciosMaisCompletos.SistemaRestaurante.dominio.Produto;
import ExerciciosMaisCompletos.SistemaRestaurante.servico.Restaurante;

public class RestauranteTeste {
    public static void main(String[] args) {
        PedidoOnline pedido = new PedidoOnline();
        Produto produto = new Produto("Pizza", 45.00);
        Produto produto1 = new Produto("Hamburguer", 35.00);
        pedido.adicionarProduto(produto);
        pedido.adicionarProduto(produto1);
        Restaurante restaurante = new Restaurante(pedido);
        restaurante.listarPedidos();
        System.out.println("----------------");
        restaurante.mostrarTotal();
        System.out.println("----------------");
        String endereco = "Rua Santo Antônio";
        restaurante.entregarPedidosOnline(endereco);



    }
}

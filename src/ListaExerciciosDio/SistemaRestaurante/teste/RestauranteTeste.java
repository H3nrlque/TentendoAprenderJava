package ListaExerciciosDio.SistemaRestaurante.teste;

import ListaExerciciosDio.SistemaRestaurante.dominio.*;
import ListaExerciciosDio.SistemaRestaurante.dominio.subClass.FrangoAParmegiana;
import ListaExerciciosDio.SistemaRestaurante.dominio.subClass.Risoto;

public class RestauranteTeste {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Ragazzo", pratosCardapio());
        Cliente cliente = new Cliente("João");
        restaurante.exibirCardapio();
        Prato prato = Cardapio.escolherPrato("Risoto");
        Pedido pedido = new Pedido(cliente);
        pedido.adicionarPrato(prato);
        restaurante.adicionarPedido(pedido);
        restaurante.exibirPedidos();
        System.out.println();
    }

    public static Cardapio pratosCardapio() {
        Cardapio cardapio = new Cardapio();
        Prato prato = new Risoto("Risoto", 80.00, "é um prato típico da região da Lombardia, no norte da Itália, e é feito com arroz arbóreo, cebola e alho fritos na manteiga ou azeite, e caldo.");
        Prato prato2 = new FrangoAParmegiana("Frango á Parmegiana", 90, "é um prato típico da culinária brasileira, onde o filé de frango é temperado, empanado e frito, depois coberto com molho de tomate e fatias de mussarela");
        cardapio.adicionarPrato(prato);
        cardapio.adicionarPrato(prato2);
        return cardapio;
    }
}

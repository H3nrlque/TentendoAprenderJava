package ListaExerciciosDio.SistemaDeLojaVirtual.servico;

import ListaExerciciosDio.SistemaDeLojaVirtual.dominio.Pedido;

public class Loja {
    public static void detalhesPedido(Pedido pedido) {
        System.out.println("Pedido");
        System.out.println("Produtos no carrinho: ");
        System.out.println(pedido.getCarrinho().toString());
        System.out.println("Tipo de pagamento: "+pedido.getTipoPagamento());
        System.out.printf("Valor total da compra: R$ %.2f",pedido.getValorTotal());
    }
}

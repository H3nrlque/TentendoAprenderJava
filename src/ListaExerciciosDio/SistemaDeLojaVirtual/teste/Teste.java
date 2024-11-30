package ListaExerciciosDio.SistemaDeLojaVirtual.teste;

import ListaExerciciosDio.SistemaDeLojaVirtual.dominio.*;
import ListaExerciciosDio.SistemaDeLojaVirtual.servico.Loja;

public class Teste {
    public static void main(String[] args) {
        Produto produto = new Celular("Iphone 16", 15000);
        Produto produto2 = new Computador("i7 256Gb", 5000);
        Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produto);
        carrinho.adicionarProduto(produto2);
        Pedido pedido = new Pedido(carrinho, "dinheiro");
        Loja.detalhesPedido(pedido);

    }
}

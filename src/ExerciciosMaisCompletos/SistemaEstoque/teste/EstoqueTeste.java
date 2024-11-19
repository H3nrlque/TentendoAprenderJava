package ExerciciosMaisCompletos.SistemaEstoque.teste;

import ExerciciosMaisCompletos.SistemaEstoque.dominio.*;

public class EstoqueTeste {
    public static void main(String[] args) {
        Produto produto = new Computador("Computador i7", 5000, 10);
        Produto produto1 = new Celular("Iphone 16", 15000, 5);
        Produto produto2 = new Televisao("Samsung 43", 2100, 10);
        Estoque estoque = new Estoque();
        estoque.adicionarProduto(produto);
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.listarProdutos();
        System.out.println("------------------------------");
        produto1.adicionarQuantidade(5);
        produto2.removerQuantidade(4);
        estoque.listarProdutos();
        System.out.println("--------------------------------");
        estoque.calcularValorTotalEmEstoque();

    }
}

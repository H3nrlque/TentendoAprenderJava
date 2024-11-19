package ExerciciosMaisCompletos.SistemaEstoque.dominio;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        if (produtos.contains(produto)) {
            return;
        }
        produtos.add(produto);
    }

    public void removerProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.nome.equals(nome)) {
                produtos.remove(produto);
            }
        }
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Produto: "+produto.getClass().getSimpleName());
            System.out.println(produto);
            System.out.println();
        }

    }
    public void calcularValorTotalEmEstoque() {
        double valorTotal = 0;
        for (Produto produto : produtos) {
            valorTotal += produto.calcularValorTotal();
        }
        System.out.println("Valor total em estoque: "+valorTotal);
    }
}

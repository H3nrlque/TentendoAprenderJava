package ExerciciosMaisCompletos.SistemaRestaurante.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    protected List<Produto> produtos = new ArrayList<>();
    protected double total;


    public void adicionarProduto(Produto produto) {
        if (!produtos.contains(produto)) {
            produtos.add(produto);
        }
    }

    public void removerProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produtos.remove(produto);
            }
        }
    }

    public double calcularTotal() {
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getTotal() {
        return total;
    }
}

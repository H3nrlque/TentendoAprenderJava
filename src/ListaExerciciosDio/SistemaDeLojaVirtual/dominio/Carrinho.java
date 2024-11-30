package ListaExerciciosDio.SistemaDeLojaVirtual.dominio;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    protected List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produtos.remove(produto);
            }
        }
    }

    public double calcularTotal() {
        double soma = 0;
        for (Produto produto : produtos) {
            soma += produto.getPreco();
        }
        return soma;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return produtos.toString();
    }
}

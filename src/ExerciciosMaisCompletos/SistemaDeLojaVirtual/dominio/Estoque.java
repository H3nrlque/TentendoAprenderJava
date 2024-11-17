package ExerciciosMaisCompletos.SistemaDeLojaVirtual.dominio;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque(Produto produto) {
        this.produtos = new ArrayList<>();
        adicionarProduto(produto);
    }

    public Estoque() {
    }

    public void adicionarProduto(Produto produto) {
        if (produtos.contains(produto)) {
            return;
        }
        produtos.add(produto);
    }

    public void removerProduto(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.remove(produtos.get(i));
            }
        }

    }

    @Override
    public String toString() {
        return "Estoque{" +
                produtos + '}';
    }
}

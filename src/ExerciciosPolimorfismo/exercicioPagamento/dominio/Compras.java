package ExerciciosPolimorfismo.exercicioPagamento.dominio;

import java.util.ArrayList;
import java.util.List;

public class Compras{
    protected static List<Produto> produtosComprados = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtosComprados.add(produto);
    }

    public void removerProduto(String nome) {
        produtosComprados.removeIf(produto -> produto.getNome().equals(nome));
    }

    public static double somaValor() {
        double valorTotal = 0;
        for (Produto produto : produtosComprados) {
             valorTotal = valorTotal + produto.getValor();
        }
        return valorTotal;
    }


}

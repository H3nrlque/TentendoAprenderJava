package ExerciciosMaisCompletos.SistemaDeLojaVirtual.teste;

import ExerciciosMaisCompletos.SistemaDeLojaVirtual.dominio.Estoque;
import ExerciciosMaisCompletos.SistemaDeLojaVirtual.dominio.Produto;
import ExerciciosMaisCompletos.SistemaDeLojaVirtual.dominio.ProdutoEletronico;

public class LojaVirtualTeste {
    public static void main(String[] args) {
        Produto produto = new ProdutoEletronico("Computador", 5000);
        Estoque estoque = new Estoque(produto);
        Produto produto2 = new ProdutoEletronico("Televisão", 2000);
        estoque.adicionarProduto(produto2);
        produto.vender();
        estoque.removerProduto(produto.getNome());
        System.out.println(estoque);

    }
}

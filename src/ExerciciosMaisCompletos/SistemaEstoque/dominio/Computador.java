package ExerciciosMaisCompletos.SistemaEstoque.dominio;

public class Computador extends Produto{
    public Computador(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public void removerQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public double calcularValorTotal() {
        return preco * quantidade;
    }
}

package ExerciciosMaisCompletos.SistemaEstoque.dominio;

public interface Atualizacao {
    default void adicionarQuantidade(int quantidade) {

    }

    default void removerQuantidade(int quantidade) {

    }

    double calcularValorTotal();
}

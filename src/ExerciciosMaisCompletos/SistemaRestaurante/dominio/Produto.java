package ExerciciosMaisCompletos.SistemaRestaurante.dominio;

public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}

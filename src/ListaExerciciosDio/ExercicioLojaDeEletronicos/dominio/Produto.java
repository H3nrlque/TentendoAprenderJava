package ListaExerciciosDio.ExercicioLojaDeEletronicos.dominio;

public abstract class Produto {
    protected String nome;
    protected String marca;
    protected double preco;

    public Produto(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPreco() {
        return preco;
    }
}

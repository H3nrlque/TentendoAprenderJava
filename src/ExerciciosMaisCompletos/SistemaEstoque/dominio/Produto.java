package ExerciciosMaisCompletos.SistemaEstoque.dominio;

public abstract class Produto implements Atualizacao {
    protected String nome;
    protected double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\n"
                +"Preço: R$ "+preco+"\n"
                +"Qusntidade: "+quantidade+"\n";
    }
}

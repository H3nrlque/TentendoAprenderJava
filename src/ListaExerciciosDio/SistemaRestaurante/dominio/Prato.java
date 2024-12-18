package ListaExerciciosDio.SistemaRestaurante.dominio;

public abstract class Prato {
    protected String nome;
    protected double preco;
    protected String descricao;

    public Prato(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+"\n"
                +"Preço: "+preco+"\n"
                +"Descrição: "+descricao+"\n";
    }
}

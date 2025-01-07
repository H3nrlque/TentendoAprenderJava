package OutraListaDeExercicios.SistemaGestaoBiblioteca.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private int anoPublicacao;
    protected String disponibilidade = "Disponível";

    public Livro(String titulo, String autor, String genero, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Título: "+titulo+"\n"
                +"Autor: "+autor+"\n"
                +"Ano de publicação: "+anoPublicacao+"\n";
    }
}

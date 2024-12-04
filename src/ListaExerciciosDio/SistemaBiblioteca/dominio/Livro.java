package ListaExerciciosDio.SistemaBiblioteca.dominio;

public class Livro {
    protected String titulo;
    protected String autor;
    protected String disponibilidade = "Disponível";

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }
}

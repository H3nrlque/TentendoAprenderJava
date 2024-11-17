package ExerciciosMaisCompletos.SistemaDeBiblioteca.dominio;

import ExerciciosMaisCompletos.SistemaDeBiblioteca.Interface.Emprestar;
import ExerciciosMaisCompletos.SistemaDeBiblioteca.Interface.Lendavel;

public abstract class Publicacao implements Emprestar, Lendavel {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Publicacao{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}

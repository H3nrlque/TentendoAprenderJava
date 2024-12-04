package ListaExerciciosDio.SistemaBiblioteca.dominio;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    protected String nome;
    protected List<Livro> livrosEmprestados = new ArrayList<>();
    protected Biblioteca biblioteca;

    public Pessoa(String nome, Biblioteca biblioteca) {
        this.nome = nome;
        this.biblioteca = biblioteca;
    }

    public void adicionarLivroEmprestado(Livro livro) {
        if (livrosEmprestados.contains(livro)) {
            return;
        }
        livrosEmprestados.add(livro);

    }

    public void removerLivroEmprestado(Livro livro) {
        if (!livrosEmprestados.contains(livro)) {
            return;
        }
        livrosEmprestados.remove(livro);
    }

    public void pegarLivroEmprestado(String titulo) {
        Livro livro = biblioteca.emprestar(titulo);
        if (livro != null) {
            adicionarLivroEmprestado(livro);
        }
    }

    public void devolverLivroEmprestado(String titulo) {
        Livro livro = biblioteca.devolver(titulo);
        if (livro != null) {
            removerLivroEmprestado(livro);
        }
    }

    public void mostrarLivrosEmprestados() {
        System.out.println("Número de livros emprestados: "+livrosEmprestados.size());
        System.out.println("Lista de livros ");
        for (Livro livrosEmprestado : livrosEmprestados) {
            System.out.println("Título: "+livrosEmprestado.titulo);
            System.out.println("Autor: "+livrosEmprestado.autor);
            System.out.println("===================");
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }
}

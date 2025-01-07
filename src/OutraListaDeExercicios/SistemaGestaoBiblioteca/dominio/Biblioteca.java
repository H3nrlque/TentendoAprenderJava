package OutraListaDeExercicios.SistemaGestaoBiblioteca.dominio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarTodosOsLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void filtrarLivroPorGenero(String genero) {
        for (Livro livro : livros) {
            if (livro.getGenero().equals(genero)) {
                System.out.println(livro);
            }
        }
    }

    public void filtrarPorAutor(String nome) {
        for (Livro livro : livros) {
            if (livro.getAutor().equals(nome)) {
                System.out.println(livro);
            }
        }
    }

    public void emprestrarLvro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                livro.disponibilidade = "indisponível";
            }
        }
    }

    public void livroEmprestados() {
        for (Livro livro : livros) {
            if (livro.disponibilidade.equals("indisponível")) {
                System.out.println(livro);
            }
        }
    }

    public void livrosDisponiveis() {
        for (Livro livro : livros) {
            if (livro.disponibilidade.equals("disponível")) {
                System.out.println(livro);
            }
        }
    }
}

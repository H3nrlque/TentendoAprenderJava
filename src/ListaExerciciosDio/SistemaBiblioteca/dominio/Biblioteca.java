package ListaExerciciosDio.SistemaBiblioteca.dominio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    protected String nome;
    protected String endereco;
    protected List<Livro> livros = new ArrayList<>();

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.titulo.equals(titulo)) {
                livros.remove(livro);
            }
        }
    }

    public Livro emprestar(String titulo) {
        for (Livro livro : livros) {
            if (livro.titulo.equals(titulo) && livro.disponibilidade.equals("Disponível")) {
                livro.disponibilidade = "Indisponível";
                return livro;
            }
        }
        return null;
    }

    public Livro devolver(String titulo) {
        for (Livro livro : livros) {
            if (livro.titulo.equals(titulo)) {
                livro.disponibilidade = "Disponível";
                return livro;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Endereço: " + endereco + "\n";
    }
}

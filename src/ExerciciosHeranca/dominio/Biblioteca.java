package ExerciciosHeranca.dominio;

import java.util.ArrayList;

public class Biblioteca {
    protected ArrayList<Livro> livros = new ArrayList<>();

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void adicionarLivro(Livro livro) {
        if (!livros.contains(livro)) {
            livros.add(livro);
        }
    }

    public void removerLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equals(titulo)) {
                livros.remove(livros.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "Biblioteca: \n"
                +livros;
    }
}

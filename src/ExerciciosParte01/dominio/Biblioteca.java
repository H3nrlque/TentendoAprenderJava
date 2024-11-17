package ExerciciosParte01.dominio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>(30);
    }

    public void adicionarLivros(Livro livro) {
        livros.add(livro);
    }

    public void removerLivros (String title) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitle().equals(title)) {
                livros.remove(livros.get(i));
            }
        }
    }

    public List<Livro> getLivros() {
        return livros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de livros: ");
        for (int i = 0; i < livros.size(); i++) {
             sb.append(livros.get(i));
        }
        return sb.toString();
    }
}


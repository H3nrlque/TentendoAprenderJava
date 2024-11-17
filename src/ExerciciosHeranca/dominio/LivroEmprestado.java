package ExerciciosHeranca.dominio;

import java.util.ArrayList;

public class LivroEmprestado extends Biblioteca {
    private String dataEmprestimo;
    private String dataDevolucao;
    private ArrayList<Livro> livrosEmprestados;

    public LivroEmprestado(String dataEmprestimo, String dataDevolucao) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.livrosEmprestados = new ArrayList<>();
    }

    public LivroEmprestado() {
    }

    public void emprestimoLivro(String titulo) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getTitulo().equals(titulo)) {
                livrosEmprestados.add(livros.get(i));
            }
        }
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Livros Emprestados: \n"
                +getLivrosEmprestados();
    }
}

package ListaExerciciosDio.SistemaBiblioteca.teste;

import ListaExerciciosDio.SistemaBiblioteca.dominio.Biblioteca;
import ListaExerciciosDio.SistemaBiblioteca.dominio.Livro;
import ListaExerciciosDio.SistemaBiblioteca.dominio.Pessoa;
import ListaExerciciosDio.SistemaBiblioteca.servico.Relatorio;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca da USP", "São Paulo");
        Livro livro = new Livro("Harry Potter", "J.K. Rowling");
        Livro livro2 = new Livro("Harry Potter 2", "J.K. Rowling");
        Livro livro3 = new Livro("Harry Potter 3", "J.K. Rowling");
        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        Pessoa pessoa = new Pessoa("João", biblioteca);
        pessoa.pegarLivroEmprestado("Harry Potter");
        Relatorio.relatorio(pessoa);
        pessoa.pegarLivroEmprestado("Harry Potter");
        Relatorio.relatorio(pessoa);
        pessoa.pegarLivroEmprestado("Harry Potter 2");
        Relatorio.relatorio(pessoa);
        pessoa.devolverLivroEmprestado("Harry Potter");
        Relatorio.relatorio(pessoa);
    }
}

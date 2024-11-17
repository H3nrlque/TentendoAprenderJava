package ExerciciosHeranca.teste;

import ExerciciosHeranca.dominio.Biblioteca;
import ExerciciosHeranca.dominio.Livro;
import ExerciciosHeranca.dominio.LivroEmprestado;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Livro livro = new Livro("Percy Jackson", "Joãozinho", 2015);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro);
        System.out.println(biblioteca);
        System.out.println("---------------------");
        LivroEmprestado livroEmprestado = new LivroEmprestado();
        livroEmprestado.emprestimoLivro("Percy Jackson");
        System.out.println(livroEmprestado);


    }
}

package OutraListaDeExercicios.SistemaGestaoBiblioteca.teste;

import OutraListaDeExercicios.SistemaGestaoBiblioteca.dominio.Biblioteca;
import OutraListaDeExercicios.SistemaGestaoBiblioteca.dominio.Livro;

import java.util.Scanner;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Biblioteca biblioteca = adicionandoLivros();
        biblioteca.listarTodosOsLivros();
    }

    public static Biblioteca adicionandoLivros() {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o nome da biblioteca: ");
        String nome = tc.nextLine();
        Biblioteca biblioteca = new Biblioteca(nome);
        for (int i = 0; i < 2; i++) {
            tc.nextLine();
            System.out.print("Título: ");
            String titulo = tc.nextLine();
            System.out.print("Autor: ");
            String autor = tc.nextLine();
            System.out.print("Gênero: ");
            String genero = tc.nextLine();
            System.out.println("Ano de publicação: ");
            int anoDePublicacao = tc.nextInt();
            Livro livro = new Livro(titulo, autor, genero, anoDePublicacao);
            biblioteca.adicionarLivro(livro);
        }
        return biblioteca;
    }
}

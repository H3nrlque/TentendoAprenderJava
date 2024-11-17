package ExerciciosParte01.ExerciciosParaFixacao;

import ExerciciosParte01.dominio.Biblioteca;
import ExerciciosParte01.dominio.Livro;

import java.util.Scanner;

public class LivroTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        System.out.print("Digite o nome do livro: ");
        String nomeLivro = tc.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = tc.nextLine();
        Livro livro = new Livro(nomeLivro, autor);
        biblioteca.adicionarLivros(livro);
        System.out.println(biblioteca);
        System.out.println();
        System.out.print("Digite o nome do livro: ");
        nomeLivro = tc.nextLine();
        System.out.print("Digite o autor do livro: ");
        autor = tc.nextLine();
        System.out.print("Digite o preço do livro: ");
        double precoLivro = tc.nextDouble();
        Livro livro2 = new Livro(nomeLivro, autor, precoLivro);
        biblioteca.adicionarLivros(livro2);
        System.out.println(biblioteca);
        System.out.print("Digite o título do livro que você quer remover: ");
        String titulo = tc.nextLine();
        biblioteca.removerLivros(titulo);
        System.out.println(biblioteca);
    }
}

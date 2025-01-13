package ExercicioClasseString.test;

import java.util.Scanner;

public class TestePalindromo {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = tc.next();
        verificarPalindromo(palavra);

    }

    private static void verificarPalindromo(String palavra) {
        String reverse = new StringBuilder(palavra).reverse().toString();
        if (reverse.equalsIgnoreCase(palavra)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palíndromo");
        }

    }
}

package ExercicioClasseString.test;

import java.util.Scanner;

public class SubstituicaoDeCaracteres {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = tc.next();
        System.out.print("Digite dois caracteres: ");
        String caractere = tc.next();
        char a = caractere.charAt(0);
        char b = caractere.charAt(1);
        String replace = palavra.replace(a, b);
        System.out.println(replace);
    }
}

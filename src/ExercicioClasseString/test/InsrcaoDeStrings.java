package ExercicioClasseString.test;

import java.util.Scanner;

public class InsrcaoDeStrings {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = tc.nextLine();
        System.out.print("Digite uma palavra para inserir na frase: ");
        String palavra = tc.next();
        System.out.print("Digite a posição: ");
        int p = tc.nextInt();
        StringBuilder sb = new StringBuilder(frase).insert(p, palavra + " ");
        System.out.println("Frase modificada: "+sb);

    }


}

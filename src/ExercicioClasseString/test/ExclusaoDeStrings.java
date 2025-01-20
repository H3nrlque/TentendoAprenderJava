package ExercicioClasseString.test;

import java.util.Scanner;

public class ExclusaoDeStrings {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = tc.next();
        System.out.print("Digite uma posição: ");
        int p = tc.nextInt();
        System.out.print("Digite outra posição: ");
        int p2 = tc.nextInt();
        StringBuilder sb = new StringBuilder(palavra).delete(p, p2);
        System.out.println("Palavra modificada: "+sb);
    }
}

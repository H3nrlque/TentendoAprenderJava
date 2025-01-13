package ExercicioClasseString.test;

import java.util.Scanner;

public class ReversaoDeStrings {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = tc.next();
        StringBuilder sb = new StringBuilder(palavra).reverse();
        System.out.println("Palavra invertida "+sb);
    }
}

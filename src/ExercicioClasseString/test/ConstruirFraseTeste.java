package ExercicioClasseString.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ConstruirFraseTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite uma palavra: ");
            palavras.add(tc.next());
        }
        for (int i = 0; i < palavras.size(); i++) {
            sb.append(palavras.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}

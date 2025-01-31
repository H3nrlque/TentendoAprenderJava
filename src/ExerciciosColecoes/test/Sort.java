package ExerciciosColecoes.test;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>(6);

        for (int i = 0; i < 6 ; i++) {
            System.out.print("Digite um número: ");
            int n = tc.nextInt();
            numeros.add(n);
        }

        numeros.sort(Comparator.reverseOrder());
        System.out.println(numeros);

        Collections.sort(numeros);
        System.out.println(numeros);


    }
}

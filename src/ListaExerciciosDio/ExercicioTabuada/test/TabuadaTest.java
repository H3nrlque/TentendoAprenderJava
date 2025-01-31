package ListaExerciciosDio.ExercicioTabuada.test;

import java.util.Scanner;

public class TabuadaTest {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("======= TABUADA INTERATIVA =======");
        System.out.print("Digite um número: ");
        int n = tc.nextInt();

        System.out.println("A tabuada de " + n + " é: ");
        for (int i = 1; i < 11; i++) {
            int r = n * i;
            System.out.println(n + " x " + i + " = " + r);
        }

    }
}

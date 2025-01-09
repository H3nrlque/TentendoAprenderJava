package ExerciciosException.test;

import java.util.Scanner;

public class TesteDivisao {
    public static void main(String[] args) {
        try {
            conta();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    private static double divisao(int a, int b) throws ArithmeticException {
        if (a != 0 && b != 0) {
            return (double) a / b;
        }
        throw new ArithmeticException("Não é possível realizar divisão por zero");
    }

    private static void conta() {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = tc.nextInt();
        System.out.print("Digite outro número: ");
        int b = tc.nextInt();
        System.out.println("Resultado da divisão = "+divisao(a, b));
    }
}

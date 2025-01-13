package ExerciciosWrapper.test;

import java.util.Scanner;

public class TesteConversao {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = tc.nextInt();
        System.out.print("Digite um número decimal: ");
        double d = tc.nextDouble();
        Integer intN = n;
        Double doubleD = d;
        System.out.println("Integer "+intN);
        System.out.println("Double "+doubleD);
    }
}

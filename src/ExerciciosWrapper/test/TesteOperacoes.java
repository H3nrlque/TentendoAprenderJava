package ExerciciosWrapper.test;

import java.util.Scanner;

public class TesteOperacoes {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Escreva um número: ");
        String n = tc.next();
        System.out.print("Escreva outro número: ");
        String d = tc.next();
        Integer intN = Integer.parseInt(n);
        Double doubleD = Double.parseDouble(d);
        System.out.println(intN);
        System.out.println(doubleD);
    }
}

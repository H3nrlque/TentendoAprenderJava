package aplicacao;

import util.Calc;

import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Calc calc = new Calc();
        do {
            System.out.print("Digite um número: ");
            calc.a = tc.nextDouble();
            System.out.print("Digite outro número: ");
            calc.b = tc.nextDouble();
            System.out.println();
            System.out.println("Operação: ");
            System.out.println("[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[5] Desistir");
            calc.opcao = tc.nextInt();
            System.out.println();
            double resultado = calc.Calcular();
            System.out.printf("Resultado da operação: %.1f",resultado);
            System.out.println("\n");
        } while (calc.opcao != 5);
    }
}

package ExerciciosParte01.ExerciciosParaFixacao;

import ExerciciosParte01.dominio.MathUtility;

import java.util.Scanner;

public class MathTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = tc.nextInt();
        System.out.print("Digite outro um número: ");
        int b = tc.nextInt();
        int result = MathUtility.Soma(a, b);
        System.out.println(result);
    }
}

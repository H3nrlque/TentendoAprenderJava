package ExerciciosException.test;

import ExerciciosException.dominio.Calcular;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        try {
             entrada();
        } catch (ArithmeticException | InputMismatchException e) {
            e.printStackTrace();
        }

    }

    public static void entrada() {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = tc.nextInt();
        System.out.print("Digite outro número: ");
        int b = tc.nextInt();
        System.out.print("Escolha a operação: ");
        String operacao = tc.next();
        double r = Calcular.calcular(a, b, operacao);
        System.out.println(r);
    }

}

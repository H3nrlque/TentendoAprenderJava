package ExerciciosParte01.ExerciciosParaFixacao;

import ExerciciosParte01.dominio.Constants;

import java.util.Scanner;

public class ConstantsTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        double raio = tc.nextDouble();
        double area = Constants.calcArea(raio);
        System.out.println(area);
    }
}

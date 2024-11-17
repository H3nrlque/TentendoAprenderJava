package aplicacao;

import util.Conversao;

import java.util.Scanner;

public class Quatro {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite uma temperatura em Celsius: ");
        double temperatura = tc.nextDouble();
        Conversao conversao = new Conversao(temperatura);
        System.out.println(conversao);
    }
}

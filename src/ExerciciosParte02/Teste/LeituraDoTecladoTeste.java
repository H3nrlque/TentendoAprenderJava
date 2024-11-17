package ExerciciosParte02.Teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = tc.next();
        System.out.print("Digite sua idade: ");
        int idade = tc.nextInt();
        System.out.print("Digite M ou F para seu sexo: ");
        char sexo = tc.next().charAt(0);
        System.out.println("-------------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println("--------------------------");

    }

}

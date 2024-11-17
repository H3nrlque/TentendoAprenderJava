package aplicacao;

import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Quantas notas você vai digitar: ");
        int n = tc.nextInt();
        double[] vetor = new double[n];
        double soma = 0.0, media;
        tc.nextLine();
        System.out.print("Nome do aluno(a): ");
        String nome = tc.nextLine();
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite a "+(i+1)+"° nota: ");
            vetor[i] = tc.nextDouble();
            soma += vetor[i];
        }
        media = soma / vetor.length;
        System.out.println("Aluno: "+nome);
        System.out.printf("Média: %.1f",media);
    }
}

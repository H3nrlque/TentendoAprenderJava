package ExerciciosParte01.ExerciciosParaFixacao;

import ExerciciosParte01.dominio.Gato;

import java.util.Scanner;

public class GatoTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Qual o nome do gato? ");
        String nome = tc.nextLine();
        System.out.print("Qual a cor do gato? ");
        String cor = tc.nextLine();
        Gato gato = new Gato(nome, cor);
        System.out.println(gato);

    }
}

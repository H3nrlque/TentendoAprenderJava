package ExerciciosParte02.Teste;

import java.util.Scanner;

public class LeituraDoTeclado2 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite sua pergunta e eu responderei sim ou não: ");
        String pergunta = tc.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}

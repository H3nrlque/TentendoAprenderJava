package ExerciciosRegex.test;

import java.util.Scanner;

public class VerificarEmail {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String regex = "([a-zA-Z0-9\\.._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";

        System.out.print("Digite um email: ");
        String email = tc.nextLine();
        isValido(email, regex);

    }

    public static void isValido(String email, String regex) {
        if (email.matches(regex)) {
            System.out.println("Email válido");
        } else {
            System.out.println("Email inválido");
        }
    }

}

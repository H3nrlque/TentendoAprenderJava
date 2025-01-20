package ExerciciosRegex.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VerificarSenha {
    public static void main(String[] args) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])([a-zA-Z0-9])(?=.*[!@#$%^&*]){8,}$";
        Scanner tc = new Scanner(System.in);

        regrasSenha();
        System.out.print("Digite uma senha: ");
        String senha = tc.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(senha);
        if (senha.matches(regex)) {
            System.out.println("Senha válida");
        } else {
            System.out.println("Senha inválida");
        }
    }

    private static void regrasSenha() {
        System.out.println("Definindo uma senha ");
        System.out.println("Pelo menos 8 caractres");
        System.out.println("Pelo menos uma letra maiúscula");
        System.out.println("Pelo menos uma letra minúscula");
        System.out.println("Pelo menos um número");
        System.out.println("Pelo menos um caractere especial");
        System.out.println();
    }
}

package ExerciciosException.test;

import ExerciciosException.dominio.SenhaInvalidaException;

import java.util.Scanner;

public class TesteSenha {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite uma senha: ");
        String senha = tc.next();
        try {
            validarSenha(senha);
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void validarSenha(String senha) throws SenhaInvalidaException {
        if (senha.length() >= 8 && senha.matches(".*[a-z].*") && senha.matches(".*[A-Z].*") && senha.matches(".*[0-9].*")) {
            System.out.println("Senha válida");
        } else {
            throw new SenhaInvalidaException("Senha inválida");
        }
    }
}

package ExerciciosException.test;

import java.util.Scanner;

public class TesteUsuario {
    public static void main(String[] args) {
        try {
            login();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }

    private static void login() throws IllegalArgumentException {
        Scanner tc = new Scanner(System.in);
        String usuario = "Gohan";
        String senha = "ssj mais forte";
        System.out.print("Usuario: ");
        String usuarioDigitado = tc.nextLine();
        System.out.print("Senha: ");
        String senhaDigitado = tc.nextLine();
        if (!usuarioDigitado.equals(usuario) || !senhaDigitado.equals(senha)) {
            throw new IllegalArgumentException("Usuário ou senha incorretos");
        }
        System.out.println("Usuário logado com sucesso");

    }
}

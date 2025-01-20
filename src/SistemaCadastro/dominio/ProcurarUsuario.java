package SistemaCadastro.dominio;

import java.util.List;
import java.util.Scanner;

public class ProcurarUsuario {
    public static void procurarPorNome(List<Usuario> usuarios) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String termoDeBusca = tc.nextLine().toLowerCase();
        System.out.println("Usuário(s) encontrados");
        for (Usuario user : usuarios) {
            if (user.getNome().toLowerCase().contains(termoDeBusca)) {
                System.out.println(user);
            }
        }
    }

    public static void procurarPorEmail(List<Usuario> usuarios) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o email: ");
        String termoDeBusca = tc.nextLine().toLowerCase();
        System.out.println("Usuário(s) encontrados");
        for (Usuario user : usuarios) {
            if (user.getEmail().toLowerCase().contains(termoDeBusca)) {
                System.out.println(user);
            }
        }
    }

    public static void procurarPorIdade(List<Usuario> usuarios) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        String termoDeBusca = tc.nextLine().toLowerCase();
        System.out.println("Usuário(s) encontrados");
        for (Usuario user : usuarios) {
            if (user.getIdade().toLowerCase().contains(termoDeBusca)) {
                System.out.println(user);
            }
        }
    }
}

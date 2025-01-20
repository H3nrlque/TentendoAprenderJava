package SistemaCadastro.servico;

import SistemaCadastro.dominio.Usuario;

import java.util.Locale;
import java.util.Scanner;

public class CadastrarUsuario {
    public static Usuario cadastrarUsuario() {
        Locale locale = Locale.US;
        Scanner tc = new Scanner(System.in).useLocale(locale);
        String nome = tc.nextLine();
        String email = tc.nextLine();
        String idade = tc.next();
        String altura = tc.next();


        String[] regexs = {"([a-zA-Z\\s]{10,100})", "([a-zA-Z0-9\\.._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+", "(\\d{2})", "([1-2])(,)([0-9]){2}"};

        String[] dados = {nome, email, idade, altura};

        boolean isValid = false;
        for (String dado : dados) {
            for (String regex : regexs) {
                if (dado.matches(regex)) {
                    isValid = true;
                }
            }
        }

        if (isValid) {
            Usuario usuario = new Usuario(nome, email, idade, altura);
            usuario.adicionarUsuario(usuario);
            return usuario;
        } else {
            throw new IllegalArgumentException("Alguma das respostas foram inválida");
        }

    }
}

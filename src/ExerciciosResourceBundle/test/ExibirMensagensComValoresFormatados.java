package ExerciciosResourceBundle.test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ExibirMensagensComValoresFormatados {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = tc.nextLine();

        ResourceBundle bundle = ResourceBundle.getBundle("messages", Locale.of("pt"));
        String formatted = MessageFormat.format(bundle.getString("welcome_user"), nome); // Utilizando o MensageFormat para passar o nome de usuário como parâmetro dentro do bundle e assim formatando a mensagem dentro da key //
        System.out.println(formatted);

    }
}

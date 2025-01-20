package ExerciciosResourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class SelecionandoOIdioma {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Por favor selecione o idioma[pt/en/es]: ");
        String idioma = tc.next();
        ResourceBundle bundle = bundleIdioma(idioma); // Método que criei para me retornar o idioma que o usuário deseja atravès de sua escolha //
        assert bundle != null; // Garantindo que a bundle não será vazia //
        System.out.println(bundle.getString("welcome")); // Chamando a key //
        System.out.println(bundle.getString("goodbye")); // Chamando a key //
    }

    private static ResourceBundle bundleIdioma(String idioma) {
        return switch (idioma) {
            case "pt" -> ResourceBundle.getBundle("messages", Locale.of("pt"));
            case "en" -> ResourceBundle.getBundle("messages", Locale.of("en"));
            case "es" -> ResourceBundle.getBundle("messages", Locale.of("es"));
            default -> null;
        };
    }
}


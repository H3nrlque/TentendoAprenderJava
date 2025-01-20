package ExerciciosResourceBundle.test;

import java.util.*;

public class ResourceBundleTest {
    public static void main(String[] args) {
        ResourceBundle bundleBR = ResourceBundle.getBundle("messages", Locale.of("pt", "BR")); // Chamando a ResourceBunde.getBundle() e a língua e o país //
        System.out.println(bundleBR.getString("greeting")); // Chamando a key dentro da bundle //
        System.out.println(bundleBR.getString("farewell")); // Chamando a key dentro da bundle //


        ResourceBundle bundleUS = ResourceBundle.getBundle("messages", Locale.of("en", "US"));  // Chamando a ResourceBunde.getBundle() e a língua e o país //
        System.out.println(bundleUS.getString("greeting"));
        System.out.println(bundleUS.getString("farewell"));


        Scanner tc = new Scanner(System.in);
        System.out.print("Digite uma chave: ");
        String key = tc.nextLine();

        try {
            ResourceBundle bundle = ResourceBundle.getBundle("messages", Locale.of("en", "US"));
            System.out.println(bundle.getString(key)); // Chamando a key através de uma String fornecida pelo usuário //
        } catch (MissingResourceException e) {
            System.out.println("Chave não encontrada"); // Cuidando da exceção //
        }

    }
}

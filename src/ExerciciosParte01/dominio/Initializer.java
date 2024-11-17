package ExerciciosParte01.dominio;

public class Initializer {
    private static int initialValue;
        static {
            System.out.println("Dentro do bloco de inicialização estático");
            initialValue = 1000;
    }

    public Initializer() {
        System.out.println(initialValue);
    }

    public static int getInitialValue() {
        return initialValue;
    }

    public static void setInitialValue(int initialValue) {
        Initializer.initialValue = initialValue;
    }
}

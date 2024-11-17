package ExerciciosParte01.dominio;

public class Constants {
    private static final double PI;
    static {
        PI = 3.14159;
    }

    public static double calcArea(double raio) {
        return PI * Math.pow(raio, 2);
    }
}

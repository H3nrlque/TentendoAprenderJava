package ListaExerciciosDio.ExercicioTriangulo.dominio;

public class Triangulo {
    private int a;
    private int b;
    private int c;

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public String tipoTriangulo() {
        if (a > b + c) {
            return "Não é possível forma rum triângulo";
        }
        if ( a == b && b == c) {
            return "Triângulo equilátero";
        } else if (a == b || a == c || b == c) {
            return "Triângulo isósceles";
        } else {
            if (a != b && b != c) {
                return "Triângulo escaleno";
            }
        }
        return null;
    }
}

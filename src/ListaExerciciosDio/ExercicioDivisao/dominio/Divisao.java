package ListaExerciciosDio.ExercicioDivisao.dominio;

import ListaExerciciosDio.ExercicioDivisao.interfaces.Calculavel;

public class Divisao implements Calculavel {
    private double a;
    private double b;

    public Divisao(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double quociente() {
        return a / b;
    }

    @Override
    public double resto() {
        return a % b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}

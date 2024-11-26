package ListaExerciciosDio.ExercicioTemperatura.dominio;

public class Fahrenheit extends Temperatura {
    public Fahrenheit(double graus) {
        super(graus);
    }

    @Override
    public double transformandoTemperatura() {
        return 5 * (graus - 32) / 9;
    }
}

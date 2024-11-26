package ListaExerciciosDio.ExercicioTemperatura.dominio;

public class Celsius extends Temperatura{
    public Celsius(double graus) {
        super(graus);
    }

    @Override
    public double transformandoTemperatura() {
        return graus * 1.8 + 32;
    }
}

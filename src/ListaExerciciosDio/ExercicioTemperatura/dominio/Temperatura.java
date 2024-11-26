package ListaExerciciosDio.ExercicioTemperatura.dominio;

public abstract class Temperatura implements Transformando {
    protected double graus;

    public Temperatura(double graus) {
        this.graus = graus;
    }

    public double getGraus() {
        return graus;
    }
}

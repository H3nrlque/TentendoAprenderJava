package ListaExerciciosDio.ExercicioTransportes.dominio;

public class Aviao extends Transporte {
    private double altitudeMaxima;

    public Aviao(int velocidade, int capacidade, double altitudeMaxima) {
        super(velocidade, capacidade);
        this.altitudeMaxima = altitudeMaxima;
    }

    @Override
    public void mover() {
        System.out.println("Avião voa no céu");
    }

    public double getAltitudeMaxima() {
        return altitudeMaxima;
    }
}

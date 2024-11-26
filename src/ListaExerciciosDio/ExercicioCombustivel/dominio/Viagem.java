package ListaExerciciosDio.ExercicioCombustivel.dominio;

import ListaExerciciosDio.ExercicioCombustivel.interfaces.Calculavel;

public class Viagem implements Calculavel {
    private int horas;
    private int velocidadeMedia;
    private static final int LITROS_POR_KM = 12;

    public Viagem(int horas, int velocidadeMedia) {
        this.horas = horas;
        this.velocidadeMedia = velocidadeMedia;
    }

    @Override
    public double distanciaPercorrida() {
        return horas * velocidadeMedia;
    }

    @Override
    public double litroDeCombustivel() {
        return distanciaPercorrida() / LITROS_POR_KM;
    }

    public int getHoras() {
        return horas;
    }

    public int getVelocidadeMedia() {
        return velocidadeMedia;
    }
}

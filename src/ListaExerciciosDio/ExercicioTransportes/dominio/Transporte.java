package ListaExerciciosDio.ExercicioTransportes.dominio;

import ListaExerciciosDio.ExercicioTransportes.interfaces.Movendo;

public abstract class Transporte implements Movendo {
    protected int velocidade;
    protected int capacidade;

    public Transporte(int velocidade, int capacidade) {
        this.velocidade = velocidade;
        this.capacidade = capacidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getCapacidade() {
        return capacidade;
    }
}

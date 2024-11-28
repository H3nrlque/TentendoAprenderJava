package ListaExerciciosDio.ExercicioTransportes.dominio;

public class Carro extends Transporte {
    private int numeroPortas;

    public Carro(int velocidade, int capacidade, int numeroPortas) {
        super(velocidade, capacidade);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void mover() {
        System.out.println("Carro anda na estrada");
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
}

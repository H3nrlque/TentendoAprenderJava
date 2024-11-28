package ListaExerciciosDio.ExercicioTransportes.dominio;

public class Barco extends Transporte {
    private String tipoCasco;

    public Barco(int velocidade, int capacidade, String tipoCasco) {
        super(velocidade, capacidade);
        this.tipoCasco = tipoCasco;
    }

    @Override
    public void mover() {
        System.out.println("Barco navega no mar");
    }

    public String getTipoCasco() {
        return tipoCasco;
    }
}

package ListaExerciciosDio.ExercicioLojaDeEletronicos.dominio;

public class Celular extends Produto {
    private String capacidadeBateria;

    public Celular(String nome, String marca, double preco, String capacidadeBateria) {
        super(nome, marca, preco);
        this.capacidadeBateria = capacidadeBateria;
    }

    public String getCapacidadeBateria() {
        return capacidadeBateria;
    }
}

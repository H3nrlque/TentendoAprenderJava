package ExerciciosPolimorfismo.exercicioAnimal.dominio;

public class Gato extends Animal{
    public Gato(String especie) {
        super(especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau Miau");
    }
}

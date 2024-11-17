package ExerciciosPolimorfismo.exercicioAnimal.dominio;

public class Pato extends Animal{
    public Pato(String especie) {
        super(especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("Quack Quack");
    }
}

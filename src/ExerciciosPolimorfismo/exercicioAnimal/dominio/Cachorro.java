package ExerciciosPolimorfismo.exercicioAnimal.dominio;

public class Cachorro extends Animal{
    public Cachorro(String especie) {
        super(especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }
}

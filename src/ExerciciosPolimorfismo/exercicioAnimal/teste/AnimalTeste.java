package ExerciciosPolimorfismo.exercicioAnimal.teste;

import ExerciciosPolimorfismo.exercicioAnimal.dominio.Animal;
import ExerciciosPolimorfismo.exercicioAnimal.dominio.Cachorro;
import ExerciciosPolimorfismo.exercicioAnimal.dominio.Gato;
import ExerciciosPolimorfismo.exercicioAnimal.dominio.Pato;
import ExerciciosPolimorfismo.exercicioAnimal.servico.FazerSom;

import java.util.ArrayList;
import java.util.List;

public class AnimalTeste {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        Animal animal = new Cachorro("Labrador");
        animais.add(animal);
        Animal animal1 = new Pato("Pato doméstico");
        animais.add(animal1);
        Animal animal2 = new Gato("Gato Siamês");
        animais.add(animal2);
        for (Animal a : animais) {
            FazerSom.Som(a);
        }

    }
}

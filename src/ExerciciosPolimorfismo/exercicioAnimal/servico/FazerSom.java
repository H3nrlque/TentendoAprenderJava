package ExerciciosPolimorfismo.exercicioAnimal.servico;

import ExerciciosPolimorfismo.exercicioAnimal.dominio.Animal;

public class FazerSom {
    public static void Som(Animal animal) {
        System.out.println("Espécie - "+animal.getEspecie());
        System.out.print("Som - ");
        animal.emitirSom();
    }
}

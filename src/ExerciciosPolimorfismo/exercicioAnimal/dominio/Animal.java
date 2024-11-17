package ExerciciosPolimorfismo.exercicioAnimal.dominio;

public abstract class Animal implements Sons{
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }
}

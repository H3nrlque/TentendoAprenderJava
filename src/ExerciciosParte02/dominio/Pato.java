package ExerciciosParte02.dominio;

public class Pato extends Ave{
    @Override
    public void reproduzir() {
        System.out.println("O pato:");
        super.reproduzir();
    }
}

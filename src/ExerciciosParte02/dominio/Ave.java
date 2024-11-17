package ExerciciosParte02.dominio;

public class Ave extends Animal {
    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("O animal põe ovos");
    }
}

package ExerciciosParte02.dominio;

public class Cachorro extends Mamifero {
    @Override
    public void reproduzir() {
        System.out.println("O cachorro: ");
        super.reproduzir();
    }
}

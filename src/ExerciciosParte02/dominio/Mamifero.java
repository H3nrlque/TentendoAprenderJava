package ExerciciosParte02.dominio;

public class Mamifero extends Animal {
    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("O animal tem filhotes");
    }
}

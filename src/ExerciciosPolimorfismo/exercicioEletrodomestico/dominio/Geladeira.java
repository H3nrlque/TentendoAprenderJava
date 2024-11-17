package ExerciciosPolimorfismo.exercicioEletrodomestico.dominio;

public class Geladeira extends Eletrodomestico{

    @Override
    public void ligar() {
        System.out.println("Ligando....");
        System.out.println();
        System.out.println("A geladeira está ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando....");
        System.out.println();
        System.out.println("A geladeira está desligada");
    }
}

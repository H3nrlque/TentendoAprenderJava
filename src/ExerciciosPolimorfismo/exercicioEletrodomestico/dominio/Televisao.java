package ExerciciosPolimorfismo.exercicioEletrodomestico.dominio;

public class Televisao extends Eletrodomestico{
    @Override
    public void ligar() {
        System.out.println("Ligando....");
        System.out.println();
        System.out.println("A televisão está ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando....");
        System.out.println();
        System.out.println("A televisão está desligada");
    }
}

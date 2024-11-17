package ExerciciosPolimorfismo.exercicioFormaGeometrica.dominio;

public class Circulo extends Forma{
    private double raio;

    public Circulo(String tipo, double raio) {
        super(tipo);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        System.out.println("Calculando área do Círculo");
        return Math.PI * Math.pow(raio, 2);
    }

    public double getRaio() {
        return raio;
    }
}

package ExerciciosPolimorfismo.exercicioFormaGeometrica.dominio;

public class Quadrado extends Forma{
    private double lado;

    public Quadrado(String tipo, double lado) {
        super(tipo);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        System.out.println("Calculando área do Quadrado");
        return Math.pow(lado, 4);
    }
}

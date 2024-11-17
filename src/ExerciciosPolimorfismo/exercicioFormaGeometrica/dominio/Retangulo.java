package ExerciciosPolimorfismo.exercicioFormaGeometrica.dominio;

public class Retangulo extends Forma{
    private double base, altura;

    public Retangulo(String tipo, double base, double altura) {
        super(tipo);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        System.out.println("Calculano área do Retângulo");
        return base * altura;
    }
}

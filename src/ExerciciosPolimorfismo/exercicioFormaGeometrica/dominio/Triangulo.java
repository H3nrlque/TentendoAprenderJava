package ExerciciosPolimorfismo.exercicioFormaGeometrica.dominio;

public class Triangulo extends Forma{
    private double base, altura;

    public Triangulo(String tipo, double base, double altura) {
        super(tipo);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        System.out.println("Calculando área do Triângulo");
        return (base * altura) / 2;
    }
}

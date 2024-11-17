package ExerciciosHeranca.dominio;

public class Retangulo extends Forma{
    private double area;
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        area = base * altura;
    }

    @Override
    public String toString() {
        return "Área do Retangulo: "+area;
    }
}

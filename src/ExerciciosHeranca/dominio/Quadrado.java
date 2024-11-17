package ExerciciosHeranca.dominio;

public class Quadrado extends Forma {
    private double area;
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        area = Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return "Área do Quadrado: "+area;
    }
}

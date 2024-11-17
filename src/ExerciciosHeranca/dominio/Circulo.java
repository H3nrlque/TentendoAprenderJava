package ExerciciosHeranca.dominio;

public class Circulo extends Forma{
    private double area;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        super.calcularArea();
        area = Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "Área do Círculo: "+area;
    }
}

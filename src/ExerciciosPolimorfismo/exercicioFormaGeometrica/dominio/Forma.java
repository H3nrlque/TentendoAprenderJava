package ExerciciosPolimorfismo.exercicioFormaGeometrica.dominio;

public abstract class Forma implements CalcularArea {
    protected String tipo;

    public Forma(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

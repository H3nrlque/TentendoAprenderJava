package ListaExerciciosDio.SistemaDeHotel.dominio;

public class Quarto {
    private int numero;
    private int capacidade;
    private double precoPorNoite;
    protected String disponibilidade = "disponível";

    public Quarto(int numero, int capacidade, double precoPorNoite) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.precoPorNoite = precoPorNoite;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    @Override
    public String toString() {
        return "Quarto: "+numero+"\n"
                +"Capacidade: "+capacidade+"\n"
                +"Preço por Noite: "+precoPorNoite+"\n";
    }
}

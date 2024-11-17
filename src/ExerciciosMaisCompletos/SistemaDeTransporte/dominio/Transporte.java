package ExerciciosMaisCompletos.SistemaDeTransporte.dominio;

public abstract class Transporte implements Viagem {
    protected int capacidade;
    protected String destino;

    public Transporte(int capacidade, String destino) {
        this.capacidade = capacidade;
        this.destino = destino;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return "Transporte: "+getClass().getSimpleName()+"\n"
               +"Capacidade: "+capacidade+"\n"
               +"Destino: "+destino+"\n";
    }
}

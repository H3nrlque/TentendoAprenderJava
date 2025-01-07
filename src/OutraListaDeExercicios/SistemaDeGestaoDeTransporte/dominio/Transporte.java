package OutraListaDeExercicios.SistemaDeGestaoDeTransporte.dominio;

public abstract class Transporte implements Calculavel {
    protected String modelo;
    protected int capacidadeCarga;
    protected Status status;

    public Transporte(String modelo, int capacidadeCarga, Status status) {
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Modelo: "+modelo+"\n"
                +"Capacidade de carga: "+capacidadeCarga+"\n"
                +"Status: "+status+"\n";
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public Status getStatus() {
        return status;
    }
}

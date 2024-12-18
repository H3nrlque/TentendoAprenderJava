package ListaExerciciosDio.SistemaDeReservasAereas.dominio;

public class Voo {
    private int numeroVoo;
    private String origem;
    private String destino;
    private int tempoDeVoo;

    public Voo(int numeroVoo, String origem, String destino, int tempoDeVoo) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.tempoDeVoo = tempoDeVoo;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public int getTempoDeVoo() {
        return tempoDeVoo;
    }

    @Override
    public String toString() {
        return  "Número do vôo: "+numeroVoo+"\n"
                +"Origem: "+origem+"\n"
                +"Destino: "+destino+"\n"
                +"Tempo de Voo: "+tempoDeVoo+" horas";
    }
}

package ExerciciosParte01.dominio;

public class Reserva {
    private String nomeCliente;
    private int numeroQuarto;
    private String dataReserva;

    public Reserva(String nomeCliente, int numeroQuarto, String dataReserva) {
        this.nomeCliente = nomeCliente;
        this.numeroQuarto = numeroQuarto;
        this.dataReserva = dataReserva;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: "+nomeCliente+"\n");
        sb.append("Número do quarto: "+numeroQuarto+"\n");
        sb.append("Data de reserva: "+dataReserva+"\n");
        return sb.toString();
    }
}

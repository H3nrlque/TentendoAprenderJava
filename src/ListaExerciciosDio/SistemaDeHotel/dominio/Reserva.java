package ListaExerciciosDio.SistemaDeHotel.dominio;

public class Reserva {
    private String dataCheck_in;
    private String dataCheck_out;
    private Quarto quarto;
    private Cliente cliente;

    public Reserva(Cliente cliente, String dataCheck_in, String dataCheck_out, Quarto quarto) {
        this.cliente = cliente;
        this.dataCheck_in = dataCheck_in;
        this.dataCheck_out = dataCheck_out;
        this.quarto = quarto;
        reservarQuarto();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getDataCheck_in() {
        return dataCheck_in;
    }

    public String getDataCheck_out() {
        return dataCheck_out;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void reservarQuarto() {
        if (!quarto.disponibilidade.equals("disponível")) {
            return;
        }
        quarto.disponibilidade = "indisponível";
    }
}

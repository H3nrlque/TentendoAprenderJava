package ListaExerciciosDio.SistemaDeHotel.dominio;

public class Reserva {
    private String nome;
    private String dataCheck_in;
    private String dataCheck_out;
    private Quarto quarto;

    public Reserva(String nome, String dataCheck_in, String dataCheck_out, Quarto quarto) {
        this.nome = nome;
        this.dataCheck_in = dataCheck_in;
        this.dataCheck_out = dataCheck_out;
        this.quarto = quarto;
        reservarQuarto();
    }

    public String getNome() {
        return nome;
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

    public void removerReserva() {

        if (quarto.disponibilidade.equals("indisponível")) {
            quarto.disponibilidade = "disponível";
        }
    }
}

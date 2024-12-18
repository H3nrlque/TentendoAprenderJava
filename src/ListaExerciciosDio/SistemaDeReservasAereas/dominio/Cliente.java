package ListaExerciciosDio.SistemaDeReservasAereas.dominio;

public class Cliente {
    private String nome;
    private Reserva reserva;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public void reservar(Reserva reserva) {
        this.reserva = reserva;
    }

    public String getNome() {
        return nome;
    }

    public Reserva getReserva() {
        return reserva;
    }
}

package ListaExerciciosDio.SistemaDeReservasAereas.dominio;

public class Reserva {
    private Cliente cliente;
    private Voo voo;

    public Reserva(Cliente cliente, Voo voo) {
        this.cliente = cliente;
        this.voo = voo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Voo getVoo() {
        return voo;
    }

    @Override
    public String toString() {
        return "Reserva\n"+
                "Cliente: "+getCliente().getNome()+"\n"
                +"Voo: "+voo+"\n";
    }
}

package ListaExerciciosDio.SistemaDeHotel.dominio;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nomeHotel;
    private List<Quarto> quartos = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public Hotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public void adicionarQuarto(Quarto quarto) {
        if (quartos.contains(quarto)) {
            return;
        }
        quartos.add(quarto);
    }

    public void adicionarReserva(Reserva reserva) {
        if (reservas.contains(reserva)) {
            return;
        }
        reservas.add(reserva);
    }

    public void removerReserva(String cpf) {
        for (Reserva reserva : reservas) {
            if (reserva.getCliente().getCpf().equals(cpf)) {
                reserva.getQuarto().disponibilidade = "disponível";
                reservas.remove(reserva);
                return;
            }
        }

    }

    public Quarto quarto(int numero) {
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numero) {
                return quarto;
            }
        }
        return null;

    }

    public void exibirReservaEspecifica(String cpf) {
        for (Reserva reserva : reservas) {
            if (reserva.getCliente().getCpf().equals(cpf)) {
                System.out.println("Nome: "+reserva.getCliente().getNome());
                System.out.println("CPF: "+reserva.getCliente().getCpf());
                System.out.println("Check-In: "+reserva.getDataCheck_in());
                System.out.println("Check-Out: "+reserva.getDataCheck_out());
                System.out.println(reserva.getQuarto());
            }
        }

    }

    public void exibirReservas() {
        for (Reserva reserva : reservas) {
            System.out.println("Nome: "+reserva.getCliente().getNome());
            System.out.println("CPF: "+reserva.getCliente().getCpf());
            System.out.println("Check-In: "+reserva.getDataCheck_in());
            System.out.println("Check-Out: "+reserva.getDataCheck_out());
            System.out.println(reserva.getQuarto());
        }
    }

    public void exibirQuartosDisponiveis() {
        for (Quarto quarto : quartos) {
            if (quarto.disponibilidade.equals("disponível")) {
                System.out.println(quarto);
            }
        }
    }

    public void exibirQuartosIndisponiveis() {
        for (Quarto quarto : quartos) {
            if (quarto.disponibilidade.equals("indisponível")) {
                System.out.println(quarto);
            }
        }
    }

    public void exibirTodosOsQuartos() {
        for (Quarto quarto : quartos) {
            System.out.println(quarto);
        }
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}

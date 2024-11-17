package ExerciciosParte01.dominio;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    public static final int totalQuartos = 30;
    public static List<Reserva> reservas = new ArrayList<>();


    public List<Reserva> getReservas() {
        return reservas;
    }

    public void adiconarReserva(Reserva reserva, int quarto) {
        reservas.add(reserva);
    }

    public void removerReserva(String nomeCliente, int numeroQuarto) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getNomeCliente().equals(nomeCliente) && reservas.get(i).getNumeroQuarto() == numeroQuarto) {
                reservas.remove(reservas.get(i));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Quartos Reservados: \n");
        for (int i = 0; i < reservas.size(); i++) {
            sb.append("Quarto ").append(reservas.get(i).getNumeroQuarto()).append("\n");
            sb.append(reservas.get(i)).append("\n");
        }
        return sb.toString();
    }
}

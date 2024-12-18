package ListaExerciciosDio.SistemaDeReservasAereas.dominio;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    private String nome;
    private List<Voo> voos = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();

    public Aeroporto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void adicionarVoo(Voo voo) {
        voos.add(voo);
    }

    public void adicionarReserva(Reserva reserva) {
        if (reservas.contains(reserva)) {
            return;
        }
        reservas.add(reserva);
        reserva.getCliente().reservar(reserva);
    }

    public Voo escolherVoo(int numero) {
        for (Voo voo : voos) {
            if (voo.getNumeroVoo() == numero) {
                return voo;
            }
        }
        return null;
    }

    public void exibirVoos() {
        System.out.println("Aeroporto: "+nome);
        System.out.println();
        for (Voo voo : voos) {
            System.out.println(voo);
            System.out.println();
        }
    }

    public void exibirReservas() {
        System.out.println("Aeroporto: "+nome);
        System.out.println();
        for (Reserva reserva : reservas) {
            System.out.println(reserva);
            System.out.println();
        }

    }
}

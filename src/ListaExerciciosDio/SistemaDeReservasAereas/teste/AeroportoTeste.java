package ListaExerciciosDio.SistemaDeReservasAereas.teste;

import ListaExerciciosDio.SistemaDeReservasAereas.dominio.Aeroporto;
import ListaExerciciosDio.SistemaDeReservasAereas.dominio.Cliente;
import ListaExerciciosDio.SistemaDeReservasAereas.dominio.Reserva;
import ListaExerciciosDio.SistemaDeReservasAereas.dominio.Voo;

import java.util.Scanner;

public class AeroportoTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Aeroporto aeroporto = aeroporto();
        aeroporto.exibirVoos();
        Cliente cliente = new Cliente("João");
        System.out.print("Escolha um voo: ");
        Reserva reserva = new Reserva(cliente, aeroporto.escolherVoo(tc.nextInt()));
        aeroporto.adicionarReserva(reserva);
        aeroporto.exibirReservas();
    }

    public static Aeroporto aeroporto() {
        Aeroporto aeroporto = new Aeroporto("Santos Dummont");
        Voo voo = new Voo(5, "Rio de Janeiro", "São Paulo", 1);
        Voo voo2 = new Voo(1, "Rio de Janeiro", "Recife", 3);
        Voo voo3 = new Voo(2, "Rio de Janeiro", "Bahia", 2);
        aeroporto.adicionarVoo(voo);
        aeroporto.adicionarVoo(voo2);
        aeroporto.adicionarVoo(voo3);
        return aeroporto;
    }
}

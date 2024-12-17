package ListaExerciciosDio.SistemaDeHotel.teste;

import ListaExerciciosDio.SistemaDeHotel.dominio.Cliente;
import ListaExerciciosDio.SistemaDeHotel.dominio.Hotel;
import ListaExerciciosDio.SistemaDeHotel.dominio.Quarto;
import ListaExerciciosDio.SistemaDeHotel.dominio.Reserva;

import java.util.Scanner;

public class HotelTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Hotel hotel = new Hotel("Hotel Bistô");
        Quarto quarto = new Quarto(5, 3, 100);
        Quarto quarto2 = new Quarto(2, 3, 150);
        Quarto quarto3 = new Quarto(4, 3, 160);
        hotel.adicionarQuarto(quarto);
        hotel.adicionarQuarto(quarto2);
        hotel.adicionarQuarto(quarto3);
        int opcao;
        do {
            System.out.println(hotel.getNomeHotel().toUpperCase());
            escolha();
            opcao = tc.nextInt();
        tc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println(hotel.getNomeHotel().toUpperCase());
                    System.out.println("Realizando Reserva");
                    System.out.println();
                    System.out.println("Dados para reserva de quarto");
                    System.out.print("Nome: ");
                    String nome = tc.nextLine();
                    System.out.println("CPF: ");
                    String cpf = tc.nextLine();
                    Cliente cliente = new Cliente(nome, cpf);
                    System.out.print("Check-In: ");
                    String check_in = tc.nextLine();
                    System.out.print("Check-Out: ");
                    String check_out = tc.nextLine();
                    tc.nextLine();
                    System.out.println("Quartos disponíveis");
                    hotel.exibirQuartosDisponiveis();
                    System.out.print("Digite o número de um quarto: ");
                    int numero = tc.nextInt();
                    hotel.quarto(numero);
                    Reserva reserva = new Reserva(cliente, check_in, check_out, hotel.quarto(numero));
                    hotel.adicionarReserva(reserva);
                    System.out.println("Reserva realizada com sucesso!");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Removendo Reserva");
                    System.out.print("CPF: ");
                    String cpfCliente = tc.nextLine();
                    hotel.removerReserva(cpfCliente);
                    System.out.println("Reserva removida!");
                    System.out.println();
                    break;
                case 3:
                    hotel.exibirQuartosDisponiveis();
                    System.out.println();
                    break;
                case 4:
                    hotel.exibirQuartosIndisponiveis();
                    System.out.println();
                    break;
                case 5:
                    System.out.println(hotel.getNomeHotel());
                    System.out.println("Sua reserva");
                    System.out.print("CPF: ");
                    cpfCliente = tc.nextLine();
                    System.out.println();
                    hotel.exibirReservaEspecifica(cpfCliente);
                    break;
                default:
                    System.out.println("Opção inválida");
                    System.out.println();
            }
        } while (opcao != 6);
    }

    public static void escolha() {
        System.out.println("[1] Fazer Reserva");
        System.out.println("[2] Remover Reserva");
        System.out.println("[3] Exibir quartos disponíveis");
        System.out.println("[4] Exibir quartos indisponíveis");
        System.out.println("[5] Exibir minha reserva");
        System.out.println("[6] Sair");
    }
}

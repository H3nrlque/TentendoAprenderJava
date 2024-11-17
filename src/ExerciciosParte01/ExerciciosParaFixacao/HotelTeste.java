package ExerciciosParte01.ExerciciosParaFixacao;


import ExerciciosParte01.dominio.Hotel;
import ExerciciosParte01.dominio.Reserva;

import java.util.Scanner;

public class HotelTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        int opcao;
        do {
            Opcoes();
            opcao = tc.nextInt();
            String nomeCliente, dataReserva;
            int numeroQuarto;
            tc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Nome do cliente: ");
                    nomeCliente = tc.nextLine();
                    System.out.print("Número do quarto: ");
                    numeroQuarto = tc.nextInt();
                    System.out.print("Insira a data da reserva: ");
                    dataReserva = tc.next();
                    Reserva reserva = new Reserva(nomeCliente, numeroQuarto, dataReserva);
                    hotel.adiconarReserva(reserva, numeroQuarto);
                    System.out.println("Reserva Realizada");
                    break;

                case 2:
                    System.out.print("Nome do cliente: ");
                    nomeCliente = tc.nextLine();
                    System.out.print("Número do quarto: ");
                    numeroQuarto = tc.nextInt();
                    hotel.removerReserva(nomeCliente, numeroQuarto);
                    System.out.println("Reserva Cancelada");
                    break;

                case 3:
                    System.out.println(hotel);
                    break;

                case 4:
                    System.out.println("Encerrando");
                    break;
            }
        } while (opcao != 4);
    }

    public static void Opcoes() {
        System.out.println("[1] Fazer reserva");
        System.out.println("[2] Cancelar reserva");
        System.out.println("[3] Mostrar quartos reservados");
        System.out.println("[4] Sair");
    }

    public static void Escolha(int opcao) {
        Scanner tc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        String nomeCliente, dataReserva;
        int numeroQuarto;

        switch (opcao) {
            case 1:
                System.out.print("Nome do cliente: ");
                nomeCliente = tc.nextLine();
                System.out.print("Número do quarto: ");
                numeroQuarto = tc.nextInt();
                System.out.print("Insira a data da reserva: ");
                dataReserva = tc.next();
                Reserva reserva = new Reserva(nomeCliente, numeroQuarto, dataReserva);
                hotel.adiconarReserva(reserva, numeroQuarto);
                System.out.println("Reserva Realizada");
                break;

            case 2:
                System.out.print("Nome do cliente: ");
                nomeCliente = tc.nextLine();
                System.out.print("Número do quarto: ");
                numeroQuarto = tc.nextInt();
                hotel.removerReserva(nomeCliente, numeroQuarto);
                System.out.println("Reserva Cancelada");
                break;

            case 3:
                System.out.println(hotel);
                break;

            case 4:
                System.out.println("Encerrando");
                break;
        }
    }

}

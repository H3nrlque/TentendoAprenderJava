package aplicacao;

import util.ConversaoMoeda;

import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        ConversaoMoeda moeda = new ConversaoMoeda();
        do {
            System.out.println("Conversão de Moeda");
            System.out.println("Escolha a moeda: ");
            System.out.println("[1] Real");
            System.out.println("[2] Dólar");
            System.out.println("[3] Euro");
            System.out.println("[4] Libra");
            System.out.println("[5] Iene");
            System.out.println("[6] Peso Argentino");
            System.out.println("[7] Sair");
            moeda.opcaoMoeda = tc.nextInt();
            System.out.println();
            System.out.print(moeda.Valor());
            moeda.valor = tc.nextDouble();
            System.out.println();
            System.out.println("Para qual quer converter: ");
            moeda.Escolha();
            moeda.opcaoConverter = tc.nextInt();
            System.out.print(moeda.Info());
            moeda.cotacao = tc.nextDouble();
            System.out.println();
            System.out.println(moeda);
            System.out.println();
        } while (moeda.opcaoMoeda != 7);
    }

}

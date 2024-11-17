package aplicacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int opcao;
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Long> numero = new ArrayList<>();
        System.out.print("Nome: ");
        nomes.add(tc.nextLine());
        System.out.print("Número: ");
        numero.add(tc.nextLong());
        System.out.println("Contato Adicionado");
        System.out.println();
        do {
            System.out.println("[1] Adicionar contato");
            System.out.println("[2] Excluir contato");
            System.out.println("[3] Procurar um contato");
            System.out.println("[4] Ver lista de contatos");
            System.out.println("[5] Sair ");
            opcao = tc.nextInt();
            System.out.println();
            tc.nextLine();
            if (opcao == 1) {
                System.out.print("Nome: ");
                nomes.add(tc.nextLine());
                System.out.print("Número: ");
                numero.add(tc.nextLong());
                System.out.println("Contato Adicionado");
                System.out.println();
            } else if (opcao == 2) {
                System.out.print("Digite o nome do contato: ");
                int p = nomes.indexOf(tc.nextLine());
                nomes.remove(p);
                numero.remove(p);
                System.out.println("Contato excluído");
                System.out.println();
            } else if (opcao == 3) {
                System.out.print("Digite o nome do contato: ");
                int p = nomes.indexOf(tc.nextLine());
                System.out.println("Nome: "+nomes.get(p));
                System.out.println("Número: "+numero.get(p));
                System.out.println();
            } else if (opcao == 4) {
                System.out.println("Lista de Contatos");
                for (int i = 0; i < nomes.size(); i++) {
                    System.out.println("Nome: "+nomes.get(i));
                    System.out.println("Número: "+numero.get(i));
                    System.out.println();
                }
            } else {
                System.out.println("Saindo...");
            }

        } while (opcao != 5);
    }


}


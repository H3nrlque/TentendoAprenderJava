package aplicacao;

import util.Vendedor;

import java.util.Scanner;

public class Um {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Vendedor: ");
        System.out.print("Nome: ");
        String nome = tc.nextLine();
        System.out.print("Salário Fixo: ");
        double salario = tc.nextDouble();
        System.out.print("Total de vendas em dinheiro: ");
        double totalVendas = tc.nextDouble();
        Vendedor vendedor = new Vendedor(nome, salario, totalVendas);
        System.out.println();
        vendedor.SalarioFinal();
        System.out.println("Informações ao final do mês: ");
        System.out.println(vendedor);
    }
}

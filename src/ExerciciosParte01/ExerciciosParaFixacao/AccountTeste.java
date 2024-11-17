package ExerciciosParte01.ExerciciosParaFixacao;

import ExerciciosParte01.dominio.Account;

import java.util.Scanner;

public class AccountTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Qual o número da conta? ");
        String accountNumber = tc.next();
        System.out.print("Qual o saldo da conta? ");
        double saldo = tc.nextDouble();
        Account account = new Account(accountNumber, saldo);
        System.out.println(account);
        System.out.println("-------------------------");
        System.out.print("Qual o número da conta? ");
        String accountNumber2 = tc.next();
        System.out.print("Qual o saldo da conta? ");
        double saldo2 = tc.nextDouble();
        Account account2 = new Account(accountNumber2, saldo2);
        System.out.println(account2);
    }
}

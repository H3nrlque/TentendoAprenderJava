package ExerciciosException.test;

import ExerciciosException.dominio.Account;
import ExerciciosException.dominio.SaldoInsuficienteException;
import ExerciciosException.dominio.WithdrawLimitException;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account = instanciarAccount();
        withdraw(account);

    }

    private static Account instanciarAccount() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Enter account data");
        System.out.print("Holder: ");
        String holder = tc.nextLine();
        System.out.print("Number: ");
        int n = tc.nextInt();
        System.out.print("Initial balance: ");
        double initialBalance = tc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = tc.nextDouble();
        System.out.println();
        return new Account(n, holder, initialBalance, withdrawLimit);
    }

    private static void withdraw(Account account) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Enter amount for withdraw: ");
        double amount = tc.nextDouble();
        try {
            account.withdraw(amount);
            System.out.printf("New balance: %.2f", account.getBalance());
        } catch (WithdrawLimitException | SaldoInsuficienteException e) {
            e.getMessage();
        }
        tc.close();
    }
}

package ExerciciosException.test;

import ExerciciosException.dominio.Conta;
import ExerciciosException.dominio.SaldoInsuficienteException;
import ExerciciosException.dominio.Titular;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Conta conta = instanciarConta();
        conta.deposito(5000);
        try {
            conta.saque(6000);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Conta instanciarConta() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Criando conta");
        System.out.print("Nome: ");
        String nome = tc.nextLine();
        System.out.print("CPF: ");
        String cpf = tc.nextLine();
        Titular titular = new Titular(nome, cpf);
        System.out.print("Número da conta: ");
        String numeroConta = tc.nextLine();
        System.out.print("Você deseja fazer um depósito inicial? ");
        char res = tc.next().charAt(0);
        if (res == 's') {
            System.out.print("Qual o valor: ");
            double valor = tc.nextDouble();
            return new Conta(titular, numeroConta, valor);
        }
        return new Conta(titular, numeroConta);
    }
}

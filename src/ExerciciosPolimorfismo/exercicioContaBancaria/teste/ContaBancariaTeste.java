package ExerciciosPolimorfismo.exercicioContaBancaria.teste;

import ExerciciosPolimorfismo.exercicioContaBancaria.dominio.Conta;
import ExerciciosPolimorfismo.exercicioContaBancaria.dominio.ContaCorrente;
import ExerciciosPolimorfismo.exercicioContaBancaria.dominio.ContaPoupanca;
import ExerciciosPolimorfismo.exercicioContaBancaria.enums.TipoConta;
import ExerciciosPolimorfismo.exercicioContaBancaria.servico.OperacoesDaConta;

import java.util.Scanner;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Qual o tipo de conta? ");
        TipoConta tipoConta = TipoConta.tipoDeConta(tc.nextLine());
        switch (tipoConta) {
            case CONTA_CORRENTE -> {
                Conta conta = new ContaCorrente("65879-1");
                conta.depositar(500);
                OperacoesDaConta.operacoes(conta, tipoConta);
                System.out.println("-------------------------------------");
                conta.sacar(200);
                OperacoesDaConta.operacoes(conta, tipoConta);
            }
            case CONTA_POUPANCA -> {
                Conta conta2 = new ContaPoupanca("56741-6");
                conta2.depositar(1000);
                OperacoesDaConta.operacoes(conta2, tipoConta);
                System.out.println("-------------------------------");
                conta2.sacar(400);
                OperacoesDaConta.operacoes(conta2, tipoConta);
            }
        }
    }
}

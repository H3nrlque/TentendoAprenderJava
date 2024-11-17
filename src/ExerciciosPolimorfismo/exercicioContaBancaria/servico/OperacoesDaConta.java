package ExerciciosPolimorfismo.exercicioContaBancaria.servico;

import ExerciciosPolimorfismo.exercicioContaBancaria.dominio.Conta;
import ExerciciosPolimorfismo.exercicioContaBancaria.enums.TipoConta;

public class OperacoesDaConta {
    public static void operacoes(Conta conta, TipoConta tipoConta) {
        if (tipoConta.getTipoConta().equals("Conta Corrente")) {
            System.out.println("CONTA CORRENTE");
            System.out.println("Número da conta:  "+conta.getNumeroConta());
            if (conta.getSaldo() < 0) {
                return;
            }
            System.out.println("Saldo atual: R$ "+conta.getSaldo());
        } else {
            System.out.println("CONTA POUPANÇA");
            System.out.println("Número da conta: "+conta.getNumeroConta());
            if (conta.getSaldo() < 0) {
                return;
            }
            System.out.println("Saldo atual: R$ "+conta.getSaldo());
        }
    }
}

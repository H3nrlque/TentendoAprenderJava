package OutraListaDeExercicios.ExercicioComEnumEHeranca.teste;

import OutraListaDeExercicios.ExercicioComEnumEHeranca.dominio.ContaBancaria;
import OutraListaDeExercicios.ExercicioComEnumEHeranca.dominio.ContaCorrente;
import OutraListaDeExercicios.ExercicioComEnumEHeranca.dominio.Poupanca;
import OutraListaDeExercicios.ExercicioComEnumEHeranca.dominio.TipoConta;

import java.util.Scanner;

public class ContaTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = tc.nextLine();
        System.out.print("Digite seu cpf: ");
        String cpf = tc.nextLine();
        System.out.print("Qual o tipo de conta? ");
        String tipoDeConta = tc.nextLine();
        ContaBancaria contaBancaria = TipoConta.instaciarConta(nome, cpf, tipoDeConta);
        contaBancaria.deposito(1000);
        System.out.println(contaBancaria.getSaldo());
        contaBancaria.saque(500);
        System.out.println(contaBancaria.getSaldo());
    }


}

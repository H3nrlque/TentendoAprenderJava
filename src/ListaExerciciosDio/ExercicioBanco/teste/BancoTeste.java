package ListaExerciciosDio.ExercicioBanco.teste;

import ListaExerciciosDio.ExercicioBanco.dominio.Banco;
import ListaExerciciosDio.ExercicioBanco.dominio.ContaCorrente;
import ListaExerciciosDio.ExercicioBanco.servico.OperacoesBancarias;

import java.util.Scanner;

public class BancoTeste {
    public static void main(String[] args) {
        Banco conta = new ContaCorrente("João", "57981-0");
        conta.depositar(5000);
        OperacoesBancarias.operacoesBancarias(conta);
        conta.sacar(1340);
        OperacoesBancarias.operacoesBancarias(conta);
        conta.sacar(4000);
        OperacoesBancarias.operacoesBancarias(conta);

    }
}

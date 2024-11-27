package ListaExerciciosDio.ExercicioBanco.servico;

import ListaExerciciosDio.ExercicioBanco.dominio.Banco;

public class OperacoesBancarias {
    public static void operacoesBancarias(Banco banco) {
        System.out.println("Titular da conta: "+banco.getTitular());
        System.out.println("Número da conta: "+banco.getNumeroConta());
        System.out.printf("Saldo: R$ %.2f\n",banco.getSaldo());
    }
}

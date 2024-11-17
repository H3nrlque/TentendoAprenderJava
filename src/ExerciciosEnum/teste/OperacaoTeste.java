package ExerciciosEnum.teste;

import ExerciciosEnum.Enums.Operacoes;
import ExerciciosEnum.dominio.OperacaoMatematica;

public class OperacaoTeste {
    public static void main(String[] args) {
        String operacao = "Soma";
        double a = 5;
        double b = 8;
        Operacoes.verificarOperacao(operacao, a, b);


    }
}

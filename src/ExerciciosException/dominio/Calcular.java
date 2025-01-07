package ExerciciosException.dominio;

import java.util.InputMismatchException;

public class Calcular {
    public static double calcular(int a, int b, String operacao) throws ArithmeticException, InputMismatchException {
        if (operacao.equals("adição")) {
            return a+b;
        } else if (operacao.equals("subtração")) {
            return a-b;
        } else if (operacao.equals("multiplicação")) {
            return a*b;
        } else if (operacao.equals("divisão") && b != 0) {
            return (double) a / b;
        } else if (b == 0) {
            throw new ArithmeticException("Não é possível fazer divisão por zero");
        } else {
            throw new InputMismatchException("Entrada inválida");
        }
    }
}

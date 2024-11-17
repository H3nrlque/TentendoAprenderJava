package ExerciciosInterfaces.dominio;

import ExerciciosInterfaces.Interfaces.OperacoesMatematicas;

public class CalculadoraSimples implements OperacoesMatematicas {
    @Override
    public int soma(int a, int b) {
        return a + b;
    }

    @Override
    public int subtracao(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplicacao(int a, int b) {
        return a * b;
    }

    @Override
    public double divisao(int a, int b) {
        return  (double) a / b;
    }


}

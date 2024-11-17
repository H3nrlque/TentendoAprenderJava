package ExerciciosInterfaces.Teste;

import ExerciciosInterfaces.dominio.CalculadoraSimples;

public class CalculadoraTeste {
    public static void main(String[] args) {
        CalculadoraSimples calculadoraSimples = new CalculadoraSimples();
        System.out.println("Soma: "+calculadoraSimples.soma(6, 6));
        System.out.println("Sbtração: "+calculadoraSimples.subtracao(9, 6));
        System.out.println("Multiplicação: "+calculadoraSimples.multiplicacao(5, 7));
        System.out.println("Divisão: "+calculadoraSimples.divisao(34, 6));
    }
}

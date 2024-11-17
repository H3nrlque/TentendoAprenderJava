package ExerciciosInterfaces.Teste;

import ExerciciosInterfaces.dominio.Multiplicacao;

public class MultiplicacaoTeste {
    public static void main(String[] args) {
        Multiplicacao multiplicacao = new Multiplicacao();
        System.out.println(multiplicacao.descricao());
        System.out.println(multiplicacao.executa(5, 8));

    }
}

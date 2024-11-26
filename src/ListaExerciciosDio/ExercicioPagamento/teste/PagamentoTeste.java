package ListaExerciciosDio.ExercicioPagamento.teste;

import ListaExerciciosDio.ExercicioPagamento.dominio.Computador;
import ListaExerciciosDio.ExercicioPagamento.dominio.Produto;
import ListaExerciciosDio.ExercicioPagamento.dominio.Televisao;
import ListaExerciciosDio.ExercicioPagamento.servico.CalculandoPagamento;

public class PagamentoTeste {
    public static void main(String[] args) {
        Produto produto = new Computador("NOtebook Acer Aspire 5", 3600, "credito");
        CalculandoPagamento.calculando(produto);
        System.out.println("----------------------------");
        Produto produto1 = new Televisao("Samsung 50 polegadas", 2500, "Dinheiro");
        CalculandoPagamento.calculando(produto1);
    }
}

package ListaExerciciosDio.ExercicioDivisao.teste;

import ListaExerciciosDio.ExercicioDivisao.dominio.Divisao;
import ListaExerciciosDio.ExercicioDivisao.servico.Calculando;

public class DivisaoTeste {
    public static void main(String[] args) {
        Divisao divisao = new Divisao(10, 3);
        Calculando.calculando(divisao);
    }
}

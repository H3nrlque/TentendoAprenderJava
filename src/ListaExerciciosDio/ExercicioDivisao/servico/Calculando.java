package ListaExerciciosDio.ExercicioDivisao.servico;

import ListaExerciciosDio.ExercicioDivisao.dominio.Divisao;

public class Calculando {
    public static void calculando(Divisao divisao) {
        System.out.printf("Quociente: %.0f\n", divisao.quociente());
        System.out.printf("Resto da divisão: %.0f\n", divisao.resto());
    }
}

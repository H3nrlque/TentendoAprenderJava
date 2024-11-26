package ListaExerciciosDio.ExercicioNotaAluno.servico;

import ListaExerciciosDio.ExercicioNotaAluno.dominio.Aluno;

public class Resultado {
    public static void resultado(Aluno aluno) {
        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Notas "+aluno.getNotas());
        System.out.println("Média: "+aluno.mediaNotas());
        System.out.println("Situação: "+aluno.situacao());
    }
}

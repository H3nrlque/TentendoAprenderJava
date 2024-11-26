package ListaExerciciosDio.ExercicioNotaAluno.teste;

import ListaExerciciosDio.ExercicioNotaAluno.dominio.Aluno;
import ListaExerciciosDio.ExercicioNotaAluno.servico.Resultado;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 7.5);
        aluno.adicionarNota(5.6);
        aluno.adicionarNota(7.9);
        aluno.adicionarNota(6.0);
        Resultado.resultado(aluno);
    }
}

package ExerciciosMaisCompletos.RegistroEscolar.dominio;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        if (alunos.contains(aluno)) {
            return;
        }
        alunos.add(aluno);
    }

    public void buscarAlunoPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                aluno.mostrarAluno();
            }
        }
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            aluno.mostrarAluno();
        }
    }
}

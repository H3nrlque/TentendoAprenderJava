package ListaExerciciosDio.GerenciadorDeCursos.dominio;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    protected String nome;
    protected List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        for (Aluno aluno1 : alunos) {
            if (aluno1.getCpf().equals(aluno.cpf)) {
                System.out.println("Aluno já matriculado");
                return;
            }
        }
        alunos.add(aluno);


    }

    public int numeroDeAlunos() {
        return alunos.size();
    }

    public void alunosNaTurma() {
        for (Aluno aluno : alunos) {
            System.out.println("Nome: "+aluno.getNome() +", CPF: "+aluno.cpf);
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}

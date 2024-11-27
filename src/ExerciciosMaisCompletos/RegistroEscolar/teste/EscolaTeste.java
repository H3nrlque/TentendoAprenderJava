package ExerciciosMaisCompletos.RegistroEscolar.teste;

import ExerciciosMaisCompletos.RegistroEscolar.dominio.Aluno;
import ExerciciosMaisCompletos.RegistroEscolar.dominio.Escola;
import ExerciciosMaisCompletos.RegistroEscolar.dominio.Nota;

public class EscolaTeste {
    public static void main(String[] args) {
        Escola escola = new Escola();
        Aluno aluno = new Aluno("João", "68791");
        Aluno aluno1 = new Aluno("Lucas", "87916");
        Nota notas = new Nota(6.7, 7.8, 5.9);
        aluno.adicionarNota(notas);
        escola.adicionarAluno(aluno);
        escola.adicionarAluno(aluno1);
        escola.listarAlunos();
        System.out.println("-----------------------");
        escola.buscarAlunoPorMatricula("68791");

    }
}

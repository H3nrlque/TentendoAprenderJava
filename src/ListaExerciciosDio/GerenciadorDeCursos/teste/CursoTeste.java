package ListaExerciciosDio.GerenciadorDeCursos.teste;

import ListaExerciciosDio.GerenciadorDeCursos.dominio.Aluno;
import ListaExerciciosDio.GerenciadorDeCursos.dominio.Curso;
import ListaExerciciosDio.GerenciadorDeCursos.dominio.Informatica;
import ListaExerciciosDio.GerenciadorDeCursos.servico.RelatorioCurso;

public class CursoTeste {
    public static void main(String[] args) {
        Curso curso = new Informatica("Informática", 120, "Aislan", "1-BIF");
        Aluno aluno = new Aluno("João", "987.754.156-65");
        Aluno aluno2 = new Aluno("Pedro", "789.879.234-78");
        Aluno aluno3 = new Aluno("Lucas", "456.823.129-16");
        Aluno aluno4 = new Aluno("Matheus", "564.624.913-49");
        curso.inscreverAluno(aluno);
        curso.inscreverAluno(aluno2);
        curso.inscreverAluno(aluno3);
        curso.inscreverAluno(aluno4);
        RelatorioCurso.relatorio(curso);
        Aluno aluno5 = new Aluno("João", "987.754.156-65");
        curso.inscreverAluno(aluno5);
        RelatorioCurso.relatorio(curso);

    }
}

package ListaExerciciosDio.GerenciadorDeCursos.servico;

import ListaExerciciosDio.GerenciadorDeCursos.dominio.Curso;

public class RelatorioCurso {
    public static void relatorio(Curso curso) {
        System.out.println("Curso: "+curso.getNome());
        System.out.println("Carga horária: "+curso.getCargaHoraria());
        System.out.println("Turma: "+curso.getTurma().getNome());
        System.out.println("Professor: "+curso.getProfessor());
        System.out.println("Número de alunos: "+curso.getTurma().numeroDeAlunos());
        System.out.println("Alunos: ");
        curso.getTurma().alunosNaTurma();
        System.out.println();
    }
}

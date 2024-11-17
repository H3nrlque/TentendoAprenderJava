package ExerciciosParte02.Teste;

import ExerciciosParte02.dominio.Disciplinas;
import ExerciciosParte02.dominio.Professor;

public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("João");
        Disciplinas disciplinas = new Disciplinas("Português");
        Disciplinas disciplinas2 = new Disciplinas("Filosofia");
        Disciplinas disciplinas3 = new Disciplinas("Inglês");
        disciplinas.adicionarProfessor(professor);
        disciplinas2.adicionarProfessor(professor);
        disciplinas3.adicionarProfessor(professor);
        professor.adicionarDisciplina(disciplinas);
        professor.adicionarDisciplina(disciplinas2);
        professor.adicionarDisciplina(disciplinas3);
        Professor professor2 = new Professor("Lucas");
        Disciplinas disciplinas4 = new Disciplinas("Matemática");
        professor2.adicionarDisciplina(disciplinas4);
        disciplinas4.adicionarProfessor(professor2);
        disciplinas.adicionarProfessor(professor2);
        System.out.println(disciplinas.getProfessores());
        System.out.println(professor+"------"+professor.getDisciplinas());
        System.out.println("-----------");
        System.out.println(disciplinas+"----------"+disciplinas.getProfessores());
    }
}

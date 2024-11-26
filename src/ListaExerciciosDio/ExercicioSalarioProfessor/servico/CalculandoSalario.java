package ListaExerciciosDio.ExercicioSalarioProfessor.servico;

import ListaExerciciosDio.ExercicioSalarioProfessor.dominio.Professor;

public class CalculandoSalario {
    public static void calculando(Professor professor) {
        System.out.println("Nome: "+professor.getNome());
        System.out.println("Idade: "+professor.getIdade());
        System.out.println("Salário: R$ "+professor.salarioLiquido());

    }
}

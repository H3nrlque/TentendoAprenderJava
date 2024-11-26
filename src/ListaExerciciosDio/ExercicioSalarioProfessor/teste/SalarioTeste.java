package ListaExerciciosDio.ExercicioSalarioProfessor.teste;

import ListaExerciciosDio.ExercicioSalarioProfessor.dominio.Professor;
import ListaExerciciosDio.ExercicioSalarioProfessor.servico.CalculandoSalario;

public class SalarioTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("João", 30, 60);
        CalculandoSalario.calculando(professor);
    }
}

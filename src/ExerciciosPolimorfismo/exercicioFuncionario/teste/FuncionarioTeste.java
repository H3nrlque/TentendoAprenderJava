package ExerciciosPolimorfismo.exercicioFuncionario.teste;

import ExerciciosPolimorfismo.exercicioFuncionario.dominio.*;
import ExerciciosPolimorfismo.exercicioFuncionario.servico.CalculadoraSalario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new AuxiliarAdministrativo("Auxiliar Administrativo", "Danielli", 20, 0.1);
        CalculadoraSalario.calcularSalario(funcionario);
        Funcionario funcionario2 = new Estagiario("Estagiário", "João", 21);
        CalculadoraSalario.calcularSalario(funcionario2);
        Funcionario funcionario3 = new Gerente("Gerente", "Lucas", 30, 0.2);
        CalculadoraSalario.calcularSalario(funcionario3);
        Funcionario funcionario4 = new SuporteDeTI("Suporte de TI", "MArcos", 25, 0.15);
        CalculadoraSalario.calcularSalario(funcionario4);
    }
}

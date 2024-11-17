package ExerciciosPolimorfismo.exercicioFuncionario.servico;

import ExerciciosPolimorfismo.exercicioFuncionario.dominio.Funcionario;

public class CalculadoraSalario {
    public static void calcularSalario(Funcionario funcionario) {
        System.out.println("Cargo: "+funcionario.getCargo());
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Idade: "+funcionario.getIdade());
        double salario = funcionario.calcularSalario();
        if (salario != 0) {
            System.out.printf("Salário: %.2f",salario);
            System.out.println();
        }
    }
}

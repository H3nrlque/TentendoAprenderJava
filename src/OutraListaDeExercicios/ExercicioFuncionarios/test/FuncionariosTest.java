package OutraListaDeExercicios.ExercicioFuncionarios.test;

import OutraListaDeExercicios.ExercicioFuncionarios.dominio.Empresa;
import OutraListaDeExercicios.ExercicioFuncionarios.dominio.Funcionario;

import java.util.Scanner;

public class FuncionariosTest {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Iniciando...");
        Empresa empresa = new Empresa("Havan", "14.568.942/0001-58");
        System.out.println("Empresa: ".concat(empresa.getNome()));
        Funcionario funcionario = adicionarFuncionario();
        empresa.contratarFuncionario(funcionario);
        int opcao;
        do {
            opcoes();
            opcao = tc.nextInt();
            switch (opcao) {
                case 1:
                    funcionario = adicionarFuncionario();
                    empresa.contratarFuncionario(funcionario);
                    break;

                case 2:
                    String cpf = retirarFuncionario();
                    empresa.demitirFuncionario(cpf);
                    break;

                case 3:
                    empresa.listarTodosOsFuncionarios();
                    break;

                case 4:
                    empresa.procurarFuncionario();
                    break;

                default:
                    System.out.println("Encerrando...");
                    tc.close();
            }

        } while (opcao != 5);
    }

    private static void opcoes() {
        System.out.println("[1] Adicionar funcionário");
        System.out.println("[2] Retirar Funcionário");
        System.out.println("[3] Listar todos os funcionários");
        System.out.println("[4] Procurar funcionário");
        System.out.println("[5] Encerrar");
    }

    private static Funcionario adicionarFuncionario() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Informações do funcionário");
        System.out.print("Nome: ");
        String nome = tc.nextLine();
        System.out.print("Data de nascimento: ");
        String dataNascimento = tc.nextLine();
        System.out.print("CPF: ");
        String cpf = tc.nextLine();
        System.out.print("Cargo: ");
        String cargo = tc.nextLine();
        System.out.print("Salário: ");
        double salario = tc.nextDouble();
        String regex = "(\\d){11}";
        if (cpf.matches(regex)) {
            return new Funcionario(nome,dataNascimento, cpf, cargo, salario);
        } else {
            return null;
        }

    }

    private static String retirarFuncionario() {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o cpf do funcionário: ");
        String cpf = tc.nextLine();
        String regex = "(\\d){11}";
        if (cpf.matches(regex)) {
            return cpf;
        } else {
            tc.close();
            return null;
        }
    }

}

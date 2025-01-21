package OutraListaDeExercicios.ExercicioFuncionarios.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    private String nome;
    private String cnpj;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void contratarFuncionario(Funcionario funcionario) {
        if (funcionarios.contains(funcionario)) {
            return;
        }
        funcionarios.add(funcionario);
        System.out.println("Funcionário contratado");
    }

    public void demitirFuncionario(String cpf) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.cpf.equals(cpf)) {
                funcionarios.remove(funcionario);
                System.out.println("Funcionário demitido");
                break;
            }
        }
    }

    public void listarTodosOsFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void procurarFuncionario() {
        Scanner tc = new Scanner(System.in);
        System.out.print("Você deseja procurar por [1] Nome, [2] CPF, [3] Cargo, [4] Salário: ");
        int op = tc.nextInt();
        switch (op) {
            case 1:
                System.out.print("Digite o nome do funcionário: ");
                String nome = tc.nextLine();
                for (Funcionario funcionario : funcionarios) {
                    if (funcionario.nome.contains(nome)) {
                        System.out.println(funcionario);
                    }
                }
                break;

            case 2:
                String regex = "(\\d){11}";
                System.out.print("Digite o cpf do funcionário: ");
                String cpf = tc.nextLine();
                if (cpf.matches(regex)) {
                    for (Funcionario funcionario : funcionarios) {
                        if (funcionario.cpf.equalsIgnoreCase(cpf)) {
                            System.out.println(funcionario);
                        }
                    }
                } else {
                    System.out.println("Cpf inválido");
                }
                break;

            case 3:
                System.out.print("Digite o cargo do funcionário");
                String cargo = tc.nextLine();
                for (Funcionario funcionario : funcionarios) {
                    if (funcionario.getCargo().contains(cargo)) {
                        System.out.println(funcionario);
                    }
                }
                break;

            case 4:
                System.out.print("Digite o salário do funcionário");
                double salario = tc.nextDouble();
                for (Funcionario funcionario : funcionarios) {
                    if (funcionario.getSalario() == salario) {
                        System.out.println(funcionario);
                    }
                }
                break;
        }



    }
}

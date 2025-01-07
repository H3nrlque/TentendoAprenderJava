package OutraListaDeExercicios.ExercicioHerancaEPolimorfismo.dominio;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Empresa(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void contratarFuncionario(Funcionario funcionario) {
        if (funcionarios.contains(funcionario)) {
            System.out.println("Este Funcionário já está na empresa");
        }
        funcionarios.add(funcionario);
    }

    public void demitirFuncionario(String nome) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.nome.equals(nome)) {
                funcionarios.remove(funcionario);
            }
        }
    }

    public void listarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

    }
}

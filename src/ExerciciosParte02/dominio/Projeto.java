package ExerciciosParte02.dominio;

import java.util.ArrayList;

public class Projeto {
    private String nome;
    private ArrayList<Funcionario> funcionarios;

    public Projeto(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (!funcionarios.contains(funcionario)) {
            funcionarios.add(funcionario);
        } else {
            System.out.println("Este funcionário já faz parte do projeto");
            return;
        }
    }

    public void removerFuncionario(String nome) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getNome().equals(nome)) {
                funcionarios.remove(funcionarios.get(i));
            }
        }
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    @Override
    public String toString() {
        return "Projeto: "+getNome();
    }
}

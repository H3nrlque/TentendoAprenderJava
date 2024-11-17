package ExerciciosParte02.Teste;

import ExerciciosParte02.dominio.Funcionario;
import ExerciciosParte02.dominio.Projeto;

public class ProjetosTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João");
        Funcionario funcionario2 = new Funcionario("Lucas");
        Funcionario funcionario3 = new Funcionario("Maria");
        Projeto projeto = new Projeto("Forms");
        projeto.adicionarFuncionario(funcionario);
        projeto.adicionarFuncionario(funcionario2);
        projeto.adicionarFuncionario(funcionario3);
        funcionario.adicionarProjeto(projeto);
        funcionario2.adicionarProjeto(projeto);
        funcionario2.adicionarProjeto(projeto);
        System.out.println(projeto);
        System.out.println("Funcionários: "+projeto.getFuncionarios());


    }
}

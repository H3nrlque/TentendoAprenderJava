package ExerciciosParte02.dominio;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private ArrayList<Projeto> projetos;

    public Funcionario(String nome) {
        this.nome = nome;
        this.projetos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarProjeto(Projeto projeto) {
        if (!projetos.contains(projeto)) {
            projetos.add(projeto);
        } else {
            System.out.println("Projeto já existente");
        }
    }

    public void removerProjeto(String nome) {
        for (int i = 0; i < projetos.size(); i++) {
            if (projetos.get(i).getNome().equals(nome)) {
                projetos.remove(projetos.get(i));
            }
        }
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    @Override
    public String toString() {
        return getNome();
    }
}

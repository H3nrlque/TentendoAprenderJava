package ExerciciosParte02.dominio;

import java.util.ArrayList;
import java.util.List;

public class Disciplinas {
    private String nome;
    private List<Professor> professores;

    public Disciplinas(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void removerProfessor(String nome) {
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getNome().equals(nome)) {
                professores.remove(professores.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return nome;
    }
}

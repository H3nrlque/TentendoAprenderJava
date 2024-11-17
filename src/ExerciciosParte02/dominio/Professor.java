package ExerciciosParte02.dominio;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private final List<Disciplinas> disciplinas;

    public Professor(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplinas> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(Disciplinas disciplina) {
        disciplinas.add(disciplina);
    }

    public void removerDisciplina(String nome) {
        for (int i = 0; i < disciplinas.size(); i++) {
            if (disciplinas.get(i).getNome().equals(nome)) {
                disciplinas.remove(disciplinas.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return getNome();
    }

    public String materias() {
        return disciplinas.toString();
    }
}

package ExerciciosParte01.dominio;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String className;
    public List<Estudantes> estudante = new ArrayList<>();

    public Classroom(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void adicionarEstudante(Estudantes estudantes) {
        this.estudante.add(estudantes);
    }

    public void removerEstudante(String name) {
        for (int i = 0; i < estudante.size(); i++) {
            if (estudante.get(i).getName().equals(name)) {
                estudante.remove(estudante.get(i));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Classe: ").append(className).append("\n");
        for (int i = 0; i < estudante.size(); i++) {
            sb.append(estudante.get(i)+"\n");
        }
        return sb.toString();
    }
}


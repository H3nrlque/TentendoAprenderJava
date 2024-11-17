package ExerciciosParte02.dominio;

import java.util.ArrayList;

public class Seminarios {
    private String titulo;
    private Local local;
    private ArrayList<Estudantes> estudantes;

    public Seminarios(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
        this.estudantes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public ArrayList<Estudantes> getEstudantes() {
        return estudantes;
    }

    public void adicionarAluno(Estudantes estudante) {
        if (!estudantes.contains(estudante)) {
            estudantes.add(estudante);
        }
    }

    public void removerEstudante(String nome) {
        for (int i = 0; i < estudantes.size(); i++) {
            if (estudantes.get(i).getNome().equals(nome)) {
                estudantes.remove(estudantes.get(i));
            }
        }
    }


    public void imprime() {
        System.out.println("Seminário:");
        System.out.println("Título: "+this.titulo);
        System.out.println("Local: "+this.local);
        for (int i = 0; i < estudantes.size(); i++) {
            System.out.println("Estudantes: "+estudantes);

        }
    }

    @Override
    public String toString() {
        return "Seminário: \n"
                +"Título: "+this.titulo+"\n"
                +"Local: "+this.local+"\n";
    }
}

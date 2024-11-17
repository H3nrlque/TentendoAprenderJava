package ExerciciosParte02.dominio;

import java.util.ArrayList;

public class Professores {
    private String nome;
    private String especialidade;
    private ArrayList<Seminarios> seminarios;

    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public ArrayList<Seminarios> getSeminarios() {
        return seminarios;
    }

    public void adicionarSeminario(Seminarios seminario) {
        if (!seminarios.contains(seminario)) {
            seminarios.add(seminario);
        }
    }

    public void removerSeminario(String titulo) {
        for (int i = 0; i < seminarios.size(); i++) {
            if (seminarios.get(i).getTitulo().equals(titulo)) {
                seminarios.remove(seminarios.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "Professor: \n"
                +"Nome: "+this.nome+"\n"
                +"Especialidade: "+this.especialidade+"\n"
                +"Seminário: "+getSeminarios()+"\n";
    }
}

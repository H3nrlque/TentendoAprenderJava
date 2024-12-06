package ListaExerciciosDio.GerenciadorDeCursos.dominio;

import ListaExerciciosDio.GerenciadorDeCursos.interfaces.Cursavel;

public abstract class Curso implements Cursavel {
    protected String nome;
    protected int cargaHoraria;
    protected String professor;
    protected Turma turma; {
        turma = new Turma();
    }

    public Curso(String nome, int cargaHoraria, String professor, String turma) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.professor = professor;
        this.turma.nome = turma;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getProfessor() {
        return professor;
    }

    public Turma getTurma() {
        return turma;
    }
}

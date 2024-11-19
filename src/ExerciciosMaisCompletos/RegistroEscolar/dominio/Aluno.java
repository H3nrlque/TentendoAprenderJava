package ExerciciosMaisCompletos.RegistroEscolar.dominio;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private List<Nota> notas = new ArrayList<>();

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void adicionarNota(Nota nota) {
        if (this.notas.contains(nota)) {
            return;
        }
        this.notas.add(nota);
        nota.calcularMedia();
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<Nota> getNotas() {
        return notas;
    }

    public void mostrarAluno() {
        System.out.println("Nome: "+nome);
        System.out.println("Matrícula: "+matricula);
        for (Nota nota : notas) {
            System.out.println("Média: "+nota.calcularMedia());
            System.out.println();
        }


    }
}

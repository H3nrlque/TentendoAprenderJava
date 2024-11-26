package ListaExerciciosDio.ExercicioNotaAluno.dominio;

import ListaExerciciosDio.ExercicioNotaAluno.interfaces.Boletim;

import java.util.ArrayList;
import java.util.List;

public class Aluno implements Boletim {
    private String nome;
    private List<Double> notas = new ArrayList<>(4);

    public Aluno(String nome, double nota) {
        this.nome = nome;
        adicionarNota(nota);
    }

    public void adicionarNota(double nota) {
        if (nota > 10) {
            return;
        }
        notas.add(nota);
    }

    @Override
    public double somaNotas() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma;
    }

    @Override
    public double mediaNotas() {
        return somaNotas() / notas.size();
    }

    @Override
    public String situacao() {
        if (mediaNotas() >= 7) {
            return "Aprovado";
        } else if (mediaNotas() >= 4 && mediaNotas() < 7) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }
}

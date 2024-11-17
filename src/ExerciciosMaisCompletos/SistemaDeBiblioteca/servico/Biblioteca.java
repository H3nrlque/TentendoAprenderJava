package ExerciciosMaisCompletos.SistemaDeBiblioteca.servico;

import ExerciciosMaisCompletos.SistemaDeBiblioteca.dominio.Publicacao;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacao> publicacoes;

    public Biblioteca(Publicacao publicacao) {
        this.publicacoes = new ArrayList<>();
        adicionarPublicacao(publicacao);
    }

    public void adicionarPublicacao(Publicacao publicacao) {
        if (publicacoes.contains(publicacao)) {
            System.out.println("Esta publicação já foi adicionada");
        } else {
            publicacoes.add(publicacao);
            System.out.println("Publicação adicionada com sucesso");
        }
    }

    public void removerPulicacao(String titulo) {
        for (int i = 0; i < publicacoes.size(); i++) {
            if (publicacoes.get(i).getTitulo().equals(titulo)) {
                publicacoes.remove(publicacoes.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "publicacoes=" + publicacoes +
                '}';
    }
}

package ExerciciosMaisCompletos.SistemaDeBiblioteca.teste;

import ExerciciosMaisCompletos.SistemaDeBiblioteca.dominio.Jornal;
import ExerciciosMaisCompletos.SistemaDeBiblioteca.dominio.Livro;
import ExerciciosMaisCompletos.SistemaDeBiblioteca.dominio.Publicacao;
import ExerciciosMaisCompletos.SistemaDeBiblioteca.dominio.Revista;
import ExerciciosMaisCompletos.SistemaDeBiblioteca.servico.Biblioteca;

public class SistemaBibliotecaTeste {
    public static void main(String[] args) {
        Publicacao publicacao = new Livro("Harry Potter", "J.K. Rowling", 2004);
        Biblioteca biblioteca = new Biblioteca(publicacao);
        Publicacao publicacao2 = new Revista("Fofocas da Semana", "Choquei", 2024 );
        biblioteca.adicionarPublicacao(publicacao2);
        System.out.println(biblioteca);
        System.out.println("-----------------------------");
        publicacao.emprestar();
        biblioteca.removerPulicacao(publicacao.getTitulo());
        System.out.println(biblioteca);
        System.out.println("-------------------------------");
        Publicacao publicacao3 = new Jornal("Campeaonato Brasileiro", "O Globo", 2023);
        biblioteca.adicionarPublicacao(publicacao3);
        publicacao.devolver();
        biblioteca.adicionarPublicacao(publicacao);
        System.out.println(biblioteca);
        System.out.println("---------------------------");
        biblioteca.removerPulicacao(publicacao2.getTitulo());
        System.out.println(biblioteca);
    }
}

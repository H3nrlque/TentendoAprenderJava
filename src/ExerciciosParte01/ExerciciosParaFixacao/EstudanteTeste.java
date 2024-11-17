package ExerciciosParte01.ExerciciosParaFixacao;

import ExerciciosParte01.dominio.Classroom;
import ExerciciosParte01.dominio.Estudantes;

import java.util.Scanner;

public class EstudanteTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Estudantes estudante;
        System.out.print("Qual o nomw da classe: ");
        String nomeClasse = tc.nextLine();
        Classroom classroom = new Classroom(nomeClasse);
        int opcao;
        do {
            System.out.println(opcoes());
            opcao = tc.nextInt();
            tc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Qual o nome do aluno? ");
                    String nomeAluno = tc.nextLine();
                    System.out.print("Qual a idade do aluno " + nomeAluno + "? ");
                    int idadeAluno = tc.nextInt();
                    estudante = new Estudantes(nomeAluno, idadeAluno);
                    classroom.adicionarEstudante(estudante);
                    System.out.println("Aluno Adicionado!");
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Qual o nome do aluno: ");
                    nomeAluno = tc.nextLine();
                    classroom.removerEstudante(nomeAluno);
                    System.out.println("Aluno Removido");
                    System.out.println();
                    break;

                case 3:
                    System.out.println(classroom);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    break;
            }
        } while (opcao != 4);
    }

    public static String opcoes() {
        StringBuilder sb = new StringBuilder();
        sb.append("[1] Adicionar aluno\n");
        sb.append("[2] Remover aluno\n");
        sb.append("[3] Ver lista de alunos\n");
        sb.append("{4] Sair\n");
        return sb.toString();
    }
}


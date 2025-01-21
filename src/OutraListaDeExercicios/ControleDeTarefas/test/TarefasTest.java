package OutraListaDeExercicios.ControleDeTarefas.test;

import OutraListaDeExercicios.ControleDeTarefas.dominio.Controle;
import OutraListaDeExercicios.ControleDeTarefas.dominio.Tarefa;

import java.util.Scanner;

public class TarefasTest {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Tarefa tarefa = adicionandoTarefa();
        Controle.adicionarTarefa(tarefa);
        int opcao;
        do {
            opcoes();
            opcao = tc.nextInt();
            System.out.println();
            switch (opcao) {
                case 1:
                    tarefa = adicionandoTarefa();
                    Controle.adicionarTarefa(tarefa);
                    break;

                case 2:
                    Controle.todasAsTarefas();
                    break;

                case 3:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = tc.nextLine();
                    Controle.marcarComoConcluida(titulo);
                    break;

                case 4:
                    System.out.print("Digite o título da tarefa: ");
                    String t = tc.nextLine();
                    Controle.removerTarefa(t);
                    break;

                case 5:
                    System.out.print("Digite o status da tarefa: ");
                    String s = tc.nextLine();
                    Controle.excluirTarefasPeloStatus(s);
                    break;

                default:
                    System.out.println("Encerrando...");
            }
        } while (opcao != 6);

    }

    private static void opcoes() {
        System.out.println("[1] Adicionar tarefa");
        System.out.println("[2] Exibir todas as tarefas");
        System.out.println("[3] Marcar tarefa como concluida");
        System.out.println("[4] Excluir tarefa");
        System.out.println("[5] Excluir tarefa concluída ou pendente");
        System.out.println("[6] Encerrar");
        System.out.print("Digite: ");
    }

    private static Tarefa adicionandoTarefa() {
        Scanner tc = new Scanner(System.in);
        System.out.print("Título: ");
        String titulo = tc.nextLine();
        System.out.print("Descrição: ");
        String descricao = tc.nextLine();
        System.out.print("Data de conlusão: ");
        String data = tc.nextLine();
        System.out.print("Prioridade: ");
        String prioridade = tc.nextLine();
        System.out.print("Status: : ");
        String status = tc.nextLine();
        return new Tarefa(titulo, descricao, data, prioridade);
    }
}

package OutraListaDeExercicios.ControleDeTarefas.dominio;

import OutraListaDeExercicios.ControleDeTarefas.enums.Status;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controle {
    private static List<Tarefa> tarefas = new ArrayList<>();

    public static void adicionarTarefa(Tarefa tarefa) {
        if (!tarefas.contains(tarefa)) {
            tarefas.add(tarefa);
            try {
                CriarArquivo.guardarTarefas(tarefa);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Tarefa Adicionada");
            System.out.println();
        }
    }

    public static void removerTarefa(String titulo) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                CriarArquivo.atualizarArquivo(titulo);
                tarefas.remove(tarefa);
                break;
            }
        }
    }

    public static void marcarComoConcluida(String titulo) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getTitulo().equalsIgnoreCase(titulo)) {
                tarefa.setStatus(Status.CONCLUIDA);
            }
        }
    }

    public static void excluirTarefasPeloStatus(String s) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus().equals(Status.procurar(s))) {
                CriarArquivo.atualizarArquivo(tarefa.getTitulo());
                tarefas.remove(tarefa);
            }
        }
    }

    public static void procurarPeloStatus(String s) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus().equals(Status.procurar(s))) {
                System.out.println(tarefa);
            }
        }
    }

    public static void todasAsTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }
}

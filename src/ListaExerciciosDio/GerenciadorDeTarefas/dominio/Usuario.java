package ListaExerciciosDio.GerenciadorDeTarefas.dominio;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    protected List<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.descricao.equals(descricao)) {
                tarefas.remove(tarefa);
            }
        }
    }

    public void filtrarPorStatus(String status) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getStatus().getNome().equals(status)) {
                System.out.println(tarefa);
            }
        }
    }

    public void filtrarPorPrioridade(String prioridade) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getPrioridade().getNome().equals(prioridade)) {
                System.out.println(tarefa);
            }
        }
    }

    public void listarTarefas() {
        System.out.println("Número de tarefas: " + tarefas.size());
        System.out.println("================================");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
            System.out.println();
            System.out.println("==============================");
        }
    }
}
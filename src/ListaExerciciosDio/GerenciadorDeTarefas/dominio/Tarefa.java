package ListaExerciciosDio.GerenciadorDeTarefas.dominio;

import ListaExerciciosDio.GerenciadorDeTarefas.enums.Prioridade;
import ListaExerciciosDio.GerenciadorDeTarefas.enums.Status;

public class Tarefa {
    protected String descricao;
    protected Prioridade prioridade;
    protected Status status;

    public Tarefa(String descricao, Prioridade prioridade, Status status) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Tarefa: \n"
                +"Descrição: "+descricao+"\n"
                +"Prioridade: "+prioridade.getNome()+"\n"
                +"Status: "+status.getNome()+"\n";
    }
}

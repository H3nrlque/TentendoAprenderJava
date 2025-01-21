package OutraListaDeExercicios.ControleDeTarefas.dominio;

import OutraListaDeExercicios.ControleDeTarefas.enums.Prioridade;
import OutraListaDeExercicios.ControleDeTarefas.enums.Status;

public class Tarefa {
    private String titulo;
    private String descricao;
    private String dataConclusao;
    private Prioridade prioridade;
    private Status status = Status.PENDENTE;

    public Tarefa(String titulo, String descricao, String dataConclusao, String c) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataConclusao = dataConclusao;
        this.prioridade = Prioridade.procurar(c);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

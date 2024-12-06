package ListaExerciciosDio.GerenciadorDeTarefas.teste;

import ListaExerciciosDio.GerenciadorDeTarefas.dominio.Tarefa;
import ListaExerciciosDio.GerenciadorDeTarefas.dominio.Usuario;
import ListaExerciciosDio.GerenciadorDeTarefas.enums.Prioridade;
import ListaExerciciosDio.GerenciadorDeTarefas.enums.Status;

public class TarefasTeste {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Fazer um exercicio de Java", Prioridade.procurarPorNome("Urgente"), Status.procurarPorNome("Pendente"));
        Tarefa tarefa2 = new Tarefa("Comprar uma cama", Prioridade.procurarPorNome("Urgente"), Status.procurarPorNome("Pendente"));
        Tarefa tarefa3 = new Tarefa("Comprar um presente", Prioridade.procurarPorNome("Dá pra adiar"), Status.procurarPorNome("Pendente"));
        Usuario usuario = new Usuario();
        usuario.adicionarTarefa(tarefa);
        usuario.adicionarTarefa(tarefa2);
        usuario.adicionarTarefa(tarefa3);
        usuario.listarTarefas();
        usuario.filtrarPorPrioridade("Urgente");
        usuario.listarTarefas();
    }
}

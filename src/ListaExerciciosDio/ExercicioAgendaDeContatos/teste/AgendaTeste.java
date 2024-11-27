package ListaExerciciosDio.ExercicioAgendaDeContatos.teste;

import ListaExerciciosDio.ExercicioAgendaDeContatos.dominio.Agenda;
import ListaExerciciosDio.ExercicioAgendaDeContatos.dominio.Contatos;

public class AgendaTeste {
    public static void main(String[] args) {
        Contatos contato = new Contatos("Danielli", "(75) 98255-3203");
        Agenda agenda = new Agenda(contato);
        Contatos contato2 = new Contatos("Henrique", "(75) 98886-8943");
        agenda.adicionarContato(contato2);
        Contatos contato3 = new Contatos("João", "(75) 98794-3203");
        agenda.adicionarContato(contato3);
        agenda.listarContatos();
        System.out.println("-----------------------------");
        agenda.removerContato("João");
        agenda.listarContatos();
        System.out.println("------------------------------");
        agenda.adicionarContato(contato);
        agenda.listarContatos();


    }
}

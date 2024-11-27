package ListaExerciciosDio.ExercicioAgendaDeContatos.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contatos> contatos = new ArrayList<>();

    public Agenda(Contatos contato) {
        adicionarContato(contato);
    }

    public void adicionarContato(Contatos contato) {
        if (contatos.contains(contato)) {
            System.out.println("Contato já existente");
        }
        contatos.add(contato);
    }

    public void removerContato(String nome) {
        for (Contatos contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contatos.remove(contato);
                return;
            }
        }
        System.out.println("Contato não encontrado");
    }

    public void listarContatos() {
        int c = 1;
        for (Contatos contato : contatos) {
            System.out.println("Contato "+c);
            System.out.println("Nome: "+contato.getNome());
            System.out.println("Número: "+contato.getNumero());
            System.out.println();
            c++;
        }

    }
}

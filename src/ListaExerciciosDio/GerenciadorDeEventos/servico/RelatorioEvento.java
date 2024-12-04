package ListaExerciciosDio.GerenciadorDeEventos.servico;

import ListaExerciciosDio.GerenciadorDeEventos.dominio.Evento;
import ListaExerciciosDio.GerenciadorDeEventos.dominio.Organizador;

public class RelatorioEvento {
    public static void relatorio(Evento evento) {
        System.out.println("Tipo de evento: "+evento.getClass().getSimpleName());
        System.out.println("Evento: "+evento.getNome());
        System.out.println("Data: "+evento.getData());
        System.out.println("Local: "+evento.getLocal());
        System.out.println("Número de participantes: "+evento.getParticipantes().size());
    }

}

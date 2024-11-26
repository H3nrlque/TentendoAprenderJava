package ListaExerciciosDio.ExercicioCombustivel.servico;

import ListaExerciciosDio.ExercicioCombustivel.dominio.Viagem;

public class CalculandoCombustivel {
    public static void calculando(Viagem viagem) {
        System.out.println("Dados da viagem: ");
        System.out.println("Tempo gasto: "+viagem.getHoras()+" horas");
        System.out.println("Velocidade média: "+viagem.getVelocidadeMedia()+" Km/h");
        System.out.println("Distância percorrida: "+viagem.distanciaPercorrida()+" Km");
        System.out.println("Litros de combustível utilizados: "+viagem.litroDeCombustivel()+" litros");
    }
}

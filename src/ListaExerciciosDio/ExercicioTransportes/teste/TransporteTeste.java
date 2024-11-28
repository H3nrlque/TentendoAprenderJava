package ListaExerciciosDio.ExercicioTransportes.teste;

import ListaExerciciosDio.ExercicioTransportes.dominio.Aviao;
import ListaExerciciosDio.ExercicioTransportes.dominio.Barco;
import ListaExerciciosDio.ExercicioTransportes.dominio.Carro;
import ListaExerciciosDio.ExercicioTransportes.dominio.Transporte;
import ListaExerciciosDio.ExercicioTransportes.servico.Transportando;

public class TransporteTeste {
    public static void main(String[] args) {
        Transporte transporte = new Carro(100, 4, 4);
        Transporte transporte2 = new Aviao(850, 300, 6000);
        Transporte transporte3 = new Barco(80, 50, "Casco planador");
        Transportando.transportando(transporte);
        System.out.println("----------------------------");
        Transportando.transportando(transporte2);
        System.out.println("----------------------------");
        Transportando.transportando(transporte3);

    }
}

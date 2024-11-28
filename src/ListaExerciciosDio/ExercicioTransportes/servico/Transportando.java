package ListaExerciciosDio.ExercicioTransportes.servico;

import ListaExerciciosDio.ExercicioTransportes.dominio.Aviao;
import ListaExerciciosDio.ExercicioTransportes.dominio.Barco;
import ListaExerciciosDio.ExercicioTransportes.dominio.Carro;
import ListaExerciciosDio.ExercicioTransportes.dominio.Transporte;

public class Transportando {
    public static void transportando(Transporte transporte) {
        System.out.println("Tipo de transpote: "+transporte.getClass().getSimpleName());
        System.out.println("Velocidade: "+transporte.getVelocidade()+" Km/h");
        System.out.println("Capacidade: "+transporte.getCapacidade()+" pessoas");
        if (transporte instanceof Carro) {
            System.out.println("Número de portas: "+((Carro) transporte).getNumeroPortas());
        } else if (transporte instanceof Aviao) {
            System.out.println("Altitude máxima: "+((Aviao) transporte).getAltitudeMaxima()+" metros");
        } else if (transporte instanceof Barco){
            System.out.println("Tipo de casco: "+((Barco) transporte).getTipoCasco());
        }
        transporte.mover();
    }
}

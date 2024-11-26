package ListaExerciciosDio.ExercicioTemperatura.servico;

import ListaExerciciosDio.ExercicioTemperatura.dominio.Celsius;
import ListaExerciciosDio.ExercicioTemperatura.dominio.Temperatura;

public class Transformando {
    public static void transformando(Temperatura temperatura) {
        System.out.println("Unidade de medida: "+temperatura.getClass().getSimpleName());
        if (temperatura instanceof Celsius) {
            System.out.println("Temperatura em Celsius: "+temperatura.getGraus()+"°");
            System.out.println("Transformando em Fahrenheit...");
            System.out.printf("Temperatura em Fahrenheit: %.4s°\n",temperatura.transformandoTemperatura());
        } else {
            System.out.println("Temperatura em Fahrenheit: "+temperatura.getGraus()+"°");
            System.out.println("Transformando em Celsius...");
            System.out.format("Temperatura em Celsius: "+temperatura.transformandoTemperatura()+"°");
        }
    }
}

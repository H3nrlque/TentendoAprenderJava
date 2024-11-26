package ListaExerciciosDio.ExercicioTemperatura.teste;

import ListaExerciciosDio.ExercicioTemperatura.dominio.Celsius;
import ListaExerciciosDio.ExercicioTemperatura.dominio.Fahrenheit;
import ListaExerciciosDio.ExercicioTemperatura.dominio.Temperatura;
import ListaExerciciosDio.ExercicioTemperatura.servico.Transformando;

public class TemperaturaTeste {
    public static void main(String[] args) {
        Temperatura temperatura = new Celsius(37);
        Transformando.transformando(temperatura);
        System.out.println("----------------------------------");
        Temperatura temperatura1 = new Fahrenheit(98.6);
        Transformando.transformando(temperatura1);
    }
}

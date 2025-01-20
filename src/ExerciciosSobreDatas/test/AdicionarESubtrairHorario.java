package ExerciciosSobreDatas.test;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AdicionarESubtrairHorario {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();

        Duration duration = Duration.of(90, ChronoUnit.MINUTES);
        LocalTime horaPlus = horaAtual.plus(duration);
        LocalTime horaMinus = horaAtual.minus(duration);
        System.out.println("Hora atual: "+horaAtual);
        System.out.println("Hora plus: "+horaPlus);
        System.out.println("Hora minus: "+horaMinus);
    }
}

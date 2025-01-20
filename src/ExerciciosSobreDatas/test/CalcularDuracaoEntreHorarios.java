package ExerciciosSobreDatas.test;

import java.time.Duration;
import java.time.LocalTime;

public class CalcularDuracaoEntreHorarios {
    public static void main(String[] args) {
        LocalTime horaAtual = LocalTime.now();
        LocalTime outraHora = LocalTime.of(22, 27, 15);
        Duration duration = Duration.between(horaAtual, outraHora);
        System.out.println("Horário inicial: "+horaAtual);
        System.out.println("Horário final: "+outraHora);
        System.out.println("Diferença: "+duration.toHours()+" horas, "+duration.toMinutes() % 60+" minutos, "+duration.toSeconds()%60+" segundos");
    }
}

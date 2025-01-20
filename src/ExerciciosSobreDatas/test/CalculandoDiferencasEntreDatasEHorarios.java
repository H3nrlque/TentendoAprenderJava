package ExerciciosSobreDatas.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CalculandoDiferencasEntreDatasEHorarios {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 6, 27);
        LocalDate date2 = LocalDate.of(2022, 4, 20);


        int diferencaAnos = (int) Math.abs(ChronoUnit.YEARS.between(date, date2));
        int diferencaMeses = (int) Math.abs(ChronoUnit.MONTHS.between(date, date2));
        int diferencaDias = (int) Math.abs(ChronoUnit.DAYS.between(date, date2));

        System.out.println("Data 1: "+date);
        System.out.println("Data 2: "+date2);

        System.out.println("Diferença em anos: "+diferencaAnos);
        System.out.println("Diferença em meses: "+diferencaMeses);
        System.out.println("Diferença em dias: "+diferencaDias);
        System.out.println("-------------------------------------------------");

        LocalTime time = LocalTime.of(21, 24, 12);
        LocalTime time2 = LocalTime.of(15, 18, 12);

        int diferencaHoras = (int) Math.abs(ChronoUnit.HOURS.between(time, time2));
        int diferencaMinutos = (int) Math.abs(ChronoUnit.MINUTES.between(time, time2));
        int diferencaSegundos = (int) Math.abs(ChronoUnit.SECONDS.between(time, time2));

        System.out.println("Time 1: "+time);
        System.out.println("Time 2: "+time2);

        System.out.println("Diferença em horas: "+diferencaHoras);
        System.out.println("Diferença em minutos: "+diferencaMinutos);
        System.out.println("Diferença em segundos: "+diferencaSegundos);



    }
}

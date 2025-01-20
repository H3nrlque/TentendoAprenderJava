package ExerciciosSobreDatas.test;

import java.time.LocalTime;

public class SubtrairHoras {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Hora atual: "+time);
        LocalTime timeMenosDuasHoras = time.minusHours(2);
        System.out.println("Menos duas horas: "+timeMenosDuasHoras);
    }
}

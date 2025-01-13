package ExerciciosClasseDateECalendar.test;

import java.util.Calendar;

import static java.util.Calendar.*;

public class Verificacao {
    public static void main(String[] args) {
        Calendar calendar = getInstance();
        calendar.set(2025, JANUARY, 15);
        int dia = calendar.get(DAY_OF_WEEK);
        if (dia == 1 || dia == 7) {
            System.out.println("É fim de semana");
        } else {
            System.out.println("Não é fim de semana");
        }
    }
}

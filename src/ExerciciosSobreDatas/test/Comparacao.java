package ExerciciosSobreDatas.test;

import java.util.Calendar;

public class Comparacao {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2025, Calendar.JANUARY, 30);
        System.out.println(calendar.getTime());
        System.out.println(calendar2.getTime());
    }
}

package ExerciciosSobreDatas.test;

import java.util.Calendar;

public class AlterandoHora {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.add(Calendar.HOUR, 2);
        calendar.add(Calendar.MINUTE, 12);
        System.out.println(calendar.getTime());

    }
}

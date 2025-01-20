package ExerciciosSobreDatas.test;

import java.util.Calendar;

public class DeterminarUltimoDia {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}

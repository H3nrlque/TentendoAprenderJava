package ExerciciosSobreDatas.test;

import java.util.Calendar;

public class DeterminarODiaPorUmaData {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int dia = calendar.get(Calendar.DAY_OF_WEEK);
        String[] dias = {null, "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        for (int i = 1; i < dias.length; i++) {
            if (dia == i) {
                System.out.println(dias[i]);
                break;
            }
        }

    }
}

package ExerciciosSobreDatas.test;

import java.util.Calendar;

public class ManipulacaoDeDatas {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Data atual: "+c.getTime());
        c.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Data após adicionar 10 dias: "+c.getTime());
    }
}

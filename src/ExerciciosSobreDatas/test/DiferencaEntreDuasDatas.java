package ExerciciosSobreDatas.test;

import java.time.LocalDate;
import java.time.Period;

public class DiferencaEntreDuasDatas {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate dateAposDoisAnos = date.plusYears(2).plusMonths(6).plusDays(25);
        System.out.println("Data 1: "+date);
        System.out.println("Data 2: "+dateAposDoisAnos);
        Period period = Period.between(date, dateAposDoisAnos);
        System.out.println("Diferença entre as datas: "+period);
    }
}

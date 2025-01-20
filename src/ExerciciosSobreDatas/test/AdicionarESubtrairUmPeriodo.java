package ExerciciosSobreDatas.test;

import java.time.LocalDate;
import java.time.Period;

public class AdicionarESubtrairUmPeriodo {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        Period period = Period.of(2, 3, 15);
        LocalDate dataMinus = dataAtual.minus(period);
        LocalDate dataPlus = dataAtual.plus(period);
        System.out.println("Data atual: "+dataAtual);
        System.out.println("Data mais um período: "+dataPlus);
        System.out.println("Data menos um período: "+dataMinus);
    }
}

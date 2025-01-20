package ExerciciosSobreDatas.test;

import java.time.LocalDate;

public class AdicionarDiasAUmaData {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Data atual: "+date);
        LocalDate dateAposTrintaDias = date.plusDays(30);
        System.out.println("Data após 30 dias: "+dateAposTrintaDias);
    }
}

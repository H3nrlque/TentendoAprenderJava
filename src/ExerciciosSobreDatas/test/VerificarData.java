package ExerciciosSobreDatas.test;

import java.time.LocalDate;

public class VerificarData {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        LocalDate outraData = date.plusDays(5);

        System.out.println(date.isBefore(outraData));
        System.out.println(outraData.isAfter(date));
    }
}

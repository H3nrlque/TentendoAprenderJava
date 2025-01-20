package ExerciciosSobreDatas.test;

import java.time.LocalDate;
import java.util.Scanner;

public class VerificarAnoBissexto {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = tc.nextInt();
        LocalDate date = LocalDate.of(ano, 5,6);
        if (date.isLeapYear()) {
            System.out.println("É bissexto");
        } else {
            System.out.println("Não é bissexto");
        }
    }
}

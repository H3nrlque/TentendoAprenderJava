package ExerciciosSobreDatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite sua data de nascimento: ");
        String dataNascimento = tc.nextLine();

        DateTimeFormatter dtf = formatoData(dataNascimento);
        assert dtf != null;
        LocalDate data = LocalDate.parse(dataNascimento, dtf);
        LocalDate now = LocalDate.now();
        Period idade = Period.between(data, now);
        System.out.println("Você tem "+idade.getYears()+" anos");

    }

    private static DateTimeFormatter formatoData(String formato) {
        DateTimeFormatter[] dateTimeFormatters = new DateTimeFormatter[2];
        String[] formatos = {"dd/MM/yyyy", "dd.MMMM.yyyy"};
        for (int i = 0; i < dateTimeFormatters.length; i++) {
            dateTimeFormatters[i] = DateTimeFormatter.ofPattern(formatos[i]);
        }

        for (DateTimeFormatter formatter : dateTimeFormatters) {
            if (isvalid(formato, formatter)) {
                return formatter;
            }
        }
        return null;
    }

    private static boolean isvalid(String formato, DateTimeFormatter formatter) {
        try {
            LocalDate.parse(formato, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}

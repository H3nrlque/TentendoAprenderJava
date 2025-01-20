package ExerciciosSobreDatas.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convertendo {
    public static void main(String[] args) {
        String dataString = "13/01/2025";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = format.parse(dataString);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("Formato inválido");
        }
    }
}

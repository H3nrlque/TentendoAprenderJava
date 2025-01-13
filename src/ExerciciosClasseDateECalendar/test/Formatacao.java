package ExerciciosClasseDateECalendar.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Formatacao {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");

        System.out.println(sdf.format(date));
        System.out.println(sdf2.format(date));
    }
}

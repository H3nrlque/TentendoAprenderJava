package ExerciciosWrapper.test;

public class TesteComparacao {
    public static void main(String[] args) {
        Integer n = null;
        Integer n2 = 5;
        try {
            Integer soma = n + n2;
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }


    }
}

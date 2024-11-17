package ExerciciosParte01.dominio;

public class Count {
    private static int count;

    public Count() {
        count++;
    }

    public static int getCount() {
        return Count.count;
    }
}

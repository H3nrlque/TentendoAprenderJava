package ExerciciosWrapper.test;

import java.util.ArrayList;

public class TesteBoxingEUnboxing {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        int a = 4;
        int b = 6;
        int c = 1;
        numeros.add(a);
        numeros.add(b);
        numeros.add(c);

        int soma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            soma+= numeros.get(i);
        }
        System.out.println(soma);
    }
}

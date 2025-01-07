package ExerciciosException.test;

import ExerciciosException.dominio.IdadeInvalidaException;

import java.util.Scanner;

public class TesteIdade {
    public static void main(String[] args) throws IdadeInvalidaException {
        try {
            entradadade();
        } catch (IdadeInvalidaException e) {
            e.printStackTrace();
        }
    }

    public static void entradadade() throws IdadeInvalidaException {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = tc.nextInt();
        if (idade > 18) {
            System.out.println("Entrada liberada");
        } else {
            throw new IdadeInvalidaException();
        }
    }
}

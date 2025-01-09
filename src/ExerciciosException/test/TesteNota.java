package ExerciciosException.test;

import ExerciciosException.dominio.NotaInvalidaException;

import java.util.Scanner;

public class TesteNota {
    public static void main(String[] args) {
        try {
            validarNota(adicionarNota());
        } catch (NotaInvalidaException e) {
            System.out.println("Erro: "+e.getMessage());
        } finally {
            System.out.println("Nota válida");
        }

    }

    private static double adicionarNota() {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite a nota: ");
        return tc.nextDouble();

    }

    private static void validarNota(double nota) throws NotaInvalidaException {
        if (!(nota >= 0 && nota <= 10)) {
            throw new NotaInvalidaException("Nota inválida. Tente novamente");
        }
    }
}

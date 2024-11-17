package aplicacao;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        int A = tc.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = tc.nextInt();
        System.out.println();
        System.out.println("Troca de valores: ");
        int aux = A;
        A = B;
        B = aux;
        System.out.println("Valor de A após a troca: "+A);
        System.out.println("Valor de B após a troca: "+B);
    }
}

package ListaExerciciosDio.ExercicioCombustivel.teste;

import ListaExerciciosDio.ExercicioCombustivel.dominio.Viagem;
import ListaExerciciosDio.ExercicioCombustivel.servico.CalculandoCombustivel;

import java.util.Scanner;

public class ViagemTeste {
    public static void main(String[] args) {
        Viagem viagem = new Viagem(3, 80);
        CalculandoCombustivel.calculando(viagem);
        System.out.println("---------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o tempo de viagem? ");
        int horas = sc.nextInt();
        System.out.print("Qual a velocidade média: ");
        int velocidadeMedia = sc.nextInt();
        Viagem viagem1 = new Viagem(horas, velocidadeMedia);
        CalculandoCombustivel.calculando(viagem1);
    }
}

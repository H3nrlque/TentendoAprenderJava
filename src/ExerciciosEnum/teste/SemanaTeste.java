package ExerciciosEnum.teste;

import ExerciciosEnum.Enums.DiasDaSemana;
import ExerciciosEnum.dominio.Semana;

import java.util.Scanner;

public class SemanaTeste {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        Semana semana = new Semana();
        semana.mensagem("Terça");

        String dia = "Quinta";
        DiasDaSemana diasDaSemana = DiasDaSemana.diasDaSemana(dia);
        System.out.println(diasDaSemana);
    }
}

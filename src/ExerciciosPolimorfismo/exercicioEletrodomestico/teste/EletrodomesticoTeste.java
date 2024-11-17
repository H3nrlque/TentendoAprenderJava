package ExerciciosPolimorfismo.exercicioEletrodomestico.teste;

import ExerciciosPolimorfismo.exercicioEletrodomestico.dominio.Eletrodomestico;
import ExerciciosPolimorfismo.exercicioEletrodomestico.dominio.Geladeira;
import ExerciciosPolimorfismo.exercicioEletrodomestico.dominio.Televisao;

public class EletrodomesticoTeste {
    public static void main(String[] args) {
        Eletrodomestico eletrodomestico = new Geladeira();
        eletrodomestico.ligar();
        System.out.println("------------");
        eletrodomestico.desligar();
        Eletrodomestico eletrodomestico2 = new Televisao();
        eletrodomestico2.ligar();
        System.out.println("------------");
        eletrodomestico2.desligar();
    }
}

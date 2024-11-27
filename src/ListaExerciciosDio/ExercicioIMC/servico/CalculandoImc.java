package ListaExerciciosDio.ExercicioIMC.servico;

import ListaExerciciosDio.ExercicioIMC.dominio.Pessoa;

public class CalculandoImc {
    public static void calculando(Pessoa pessoa) {
        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Altura: "+pessoa.getAltura()+"m");
        System.out.println("Peso: "+pessoa.getPeso()+"Kg");
        System.out.println("Calculando IMC....");
        System.out.printf("IMC: %.1f",pessoa.calcularImc());
        System.out.println("Classificação: "+pessoa.classificacaoImc());
    }
}

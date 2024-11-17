package ExerciciosPolimorfismo.exercicioVeiculo.servico;

import ExerciciosPolimorfismo.exercicioVeiculo.dominio.Veiculo;

public class Abastecendo {
    public static void abastecer(Veiculo veiculo) {
        System.out.println("Abastecendo o veículo");
        System.out.println("Tipo do veículo: "+veiculo.getTipo());
        System.out.println("Tipo de combustível: "+veiculo.getTipoCombustivel());
        System.out.println("Quantidade abastecida: "+veiculo.getQuantidadeCombustivel());
        int tanque = veiculo.abastecer();
        System.out.println("Nível do tanque: "+tanque);
        System.out.println();
    }
}

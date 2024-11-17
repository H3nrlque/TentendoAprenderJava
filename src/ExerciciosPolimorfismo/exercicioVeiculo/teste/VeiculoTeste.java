package ExerciciosPolimorfismo.exercicioVeiculo.teste;

import ExerciciosPolimorfismo.exercicioVeiculo.dominio.Caminhao;
import ExerciciosPolimorfismo.exercicioVeiculo.dominio.Carro;
import ExerciciosPolimorfismo.exercicioVeiculo.dominio.Moto;
import ExerciciosPolimorfismo.exercicioVeiculo.dominio.Veiculo;
import ExerciciosPolimorfismo.exercicioVeiculo.servico.Abastecendo;

public class VeiculoTeste {
    public static void main(String[] args) {
        Veiculo veiculo = new Moto("Moto", "2024", "Gasolina", 10);
        Abastecendo.abastecer(veiculo);
        System.out.println();
        Veiculo veiculo2 = new Carro("Carro", "2021", "Gasolina Aditivada", 20);
        Abastecendo.abastecer(veiculo2);
        System.out.println();
        Veiculo veiculo3 = new Caminhao("Caminhão", "2018", "Gasolina Comum", 50);
        Abastecendo.abastecer(veiculo3);
        System.out.println();
    }
}

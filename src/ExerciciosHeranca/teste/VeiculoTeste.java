package ExerciciosHeranca.teste;

import ExerciciosHeranca.dominio.Carro;

public class VeiculoTeste {
    public static void main(String[] args) {
        Carro carro = new Carro(25);
        carro.abastecer(20);
        System.out.println(carro);
    }
}

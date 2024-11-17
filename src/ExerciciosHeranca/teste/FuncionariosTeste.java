package ExerciciosHeranca.teste;

import ExerciciosHeranca.dominio.Gerente;
import ExerciciosHeranca.dominio.Vendedor;

public class FuncionariosTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Lucas", 5000, 500);
        gerente.calcularSalario();
        System.out.println(gerente);
        System.out.println("---------------");
        Vendedor vendedor = new Vendedor("João", 1500, 150);
        vendedor.calcularSalario();
        System.out.println(vendedor);
    }


}

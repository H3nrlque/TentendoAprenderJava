package ExerciciosParte02.Teste;

import ExerciciosParte02.dominio.Cliente;
import ExerciciosParte02.dominio.ContaBancaria;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("1647", "57981-1");
        ContaBancaria contaBancaria2 = new ContaBancaria("1649", "55781-1");
        Cliente cliente = new Cliente("João", "108.023.275-32");
        Cliente cliente2 = new Cliente("Lucas", "108.020.855-04");
        cliente.adicionarContaBancaria(contaBancaria);
        cliente.adicionarContaBancaria(contaBancaria2);
        contaBancaria.adicionarCliente(cliente);
        contaBancaria2.adicionarCliente(cliente);
        cliente.imprime();
        System.out.println("------------");
        contaBancaria.imprime();

    }
}

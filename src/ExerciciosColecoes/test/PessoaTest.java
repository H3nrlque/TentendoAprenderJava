package ExerciciosColecoes.test;

import ExerciciosColecoes.dominio.Pessoa;

import java.util.HashSet;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Henrique", 20, "456.987.456-65");
        Pessoa pessoa2 = new Pessoa("João", 25, "456.987.456-65");
        Pessoa pessoa3 = new Pessoa("Lucas", 22, "894.586.145-98");

        System.out.println(pessoa);
        if (pessoa.hashCode() == pessoa2.hashCode()) {
            System.out.println(pessoa2);
        } else if (pessoa.hashCode() == pessoa3.hashCode()) {
            System.out.println(pessoa3);
        }

        HashSet<Pessoa> pessoas = new HashSet<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        System.out.println(pessoas);

        System.out.println(pessoa.hashCode());
        System.out.println(pessoa2.hashCode());
        System.out.println(pessoa3.hashCode());

    }
}

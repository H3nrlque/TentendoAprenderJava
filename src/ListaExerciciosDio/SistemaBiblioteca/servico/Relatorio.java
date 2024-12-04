package ListaExerciciosDio.SistemaBiblioteca.servico;

import ListaExerciciosDio.SistemaBiblioteca.dominio.Pessoa;

public class Relatorio {
    public static void relatorio(Pessoa pessoa) {
        System.out.println("Meus Dados");
        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Biblioteca Escolhida: "+pessoa.getBiblioteca());
        System.out.println("Meus livros: ");
        pessoa.mostrarLivrosEmprestados();
        System.out.println();
        System.out.println();

    }
}

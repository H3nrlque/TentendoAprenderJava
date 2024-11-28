package ListaExerciciosDio.ExercicioLojaDeEletronicos.servico;

import ListaExerciciosDio.ExercicioLojaDeEletronicos.dominio.Celular;
import ListaExerciciosDio.ExercicioLojaDeEletronicos.dominio.Notebook;
import ListaExerciciosDio.ExercicioLojaDeEletronicos.dominio.Produto;
import ListaExerciciosDio.ExercicioLojaDeEletronicos.dominio.Televisao;

public class DetalhandoProdutos {
    public static void detalhes(Produto produto) {
        System.out.println("Tipo de produto: "+produto.getClass().getSimpleName());
        System.out.println("Nome: "+produto.getNome());
        System.out.printf("Preço: R$ %.2f\n",produto.getPreco());
        System.out.println("Marca: "+produto.getMarca());
        if (produto instanceof Celular) {
            System.out.println("Capacidade de bateria: "+((Celular) produto).getCapacidadeBateria());
        } else if (produto instanceof Notebook) {
            System.out.println("Tamanho da tela: "+((Notebook) produto).getTamanhoTela());
        } else if (produto instanceof Televisao) {
            System.out.println("Resolução: "+((Televisao) produto).getResolucao());
        }
    }
}

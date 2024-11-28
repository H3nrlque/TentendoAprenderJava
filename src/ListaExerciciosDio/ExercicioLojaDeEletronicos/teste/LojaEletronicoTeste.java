package ListaExerciciosDio.ExercicioLojaDeEletronicos.teste;

import ListaExerciciosDio.ExercicioLojaDeEletronicos.dominio.Celular;
import ListaExerciciosDio.ExercicioLojaDeEletronicos.dominio.Notebook;
import ListaExerciciosDio.ExercicioLojaDeEletronicos.dominio.Produto;
import ListaExerciciosDio.ExercicioLojaDeEletronicos.dominio.Televisao;
import ListaExerciciosDio.ExercicioLojaDeEletronicos.servico.DetalhandoProdutos;

public class LojaEletronicoTeste {
    public static void main(String[] args) {
        Produto produto = new Celular("Iphone 16", "Apple", 15000, "30000 mph");
        DetalhandoProdutos.detalhes(produto);
        System.out.println("---------------------------");
        Produto produto2 = new Notebook("Acer Aspire 5", "Acer", 3600, "16 polegadas");
        DetalhandoProdutos.detalhes(produto2);
        System.out.println("---------------------------");
        Produto produto3 = new Televisao("Smart TV 50 4K", "Samsung", 2200, "4K (3,840 x 2,160)");
        DetalhandoProdutos.detalhes(produto3);
    }
}

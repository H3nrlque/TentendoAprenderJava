package ExerciciosPolimorfismo.exercicioPagamento.teste;

import ExerciciosPolimorfismo.exercicioPagamento.dominio.Compras;
import ExerciciosPolimorfismo.exercicioPagamento.dominio.Computador;
import ExerciciosPolimorfismo.exercicioPagamento.dominio.Produto;
import ExerciciosPolimorfismo.exercicioPagamento.dominio.TV;
import ExerciciosPolimorfismo.exercicioPagamento.enums.TipoPagamento;
import ExerciciosPolimorfismo.exercicioPagamento.servico.Pagamento;

public class PagamentoTeste {
    public static void main(String[] args) {
        Produto produto = new Computador("i7, 32gb de Ram", 8000);
        Produto produto1 = new TV("Samsung 50", 2500);
        Compras compras = new Compras();
        compras.adicionarProduto(produto);
        compras.adicionarProduto(produto1);
        String tipoDePagamento = "Credito";
        TipoPagamento tipoPagamento = TipoPagamento.tipoPagamento(tipoDePagamento);
        Pagamento pagamento = new Pagamento(tipoPagamento);
        pagamento.realizarPagamento();

    }
}

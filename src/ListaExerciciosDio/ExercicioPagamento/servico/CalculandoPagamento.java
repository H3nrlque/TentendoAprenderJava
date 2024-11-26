package ListaExerciciosDio.ExercicioPagamento.servico;

import ListaExerciciosDio.ExercicioPagamento.dominio.Produto;

public class CalculandoPagamento {
    public static void calculando(Produto produto) {
        System.out.println("Produto: "+produto.getClass().getSimpleName());
        System.out.println("Nome: "+produto.getNome());
        System.out.println("Valor: R$ "+produto.getValor()+" reais");
        System.out.println("Tipo de pagamento: "+produto.getTipoPagamento());
        System.out.println("Valor a pagar: R$ "+produto.tipoPagamento()+" reais");
    }
}

package ExerciciosPolimorfismo.exercicioPagamento.servico;

import ExerciciosPolimorfismo.exercicioPagamento.dominio.Compras;
import ExerciciosPolimorfismo.exercicioPagamento.dominio.Produto;
import ExerciciosPolimorfismo.exercicioPagamento.enums.TipoPagamento;

public class Pagamento extends Compras {
    private TipoPagamento tipoPagamento;

    public Pagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void realizarPagamento() {
        System.out.println("Lista de produtos comprados: ");
        for (Produto produtos : produtosComprados) {
            System.out.println(produtos.getNome());
        }
        System.out.println();
        double valorPago = somaValor();
        if (tipoPagamento.getTipo().equals("Credito")) {
            System.out.println("Tipo de pagamento: "+tipoPagamento.getTipo());
            valorPago -= valorPago * 0.05;
            System.out.printf("Valor pago: R$ %.2f\n",valorPago);
            System.out.println("Pagando realizado com sucesso");
        } else if (tipoPagamento.getTipo().equals("Debito")) {
            System.out.println("Tipo de pagamento: "+tipoPagamento.getTipo());
            valorPago -= valorPago * 0.1;
            System.out.printf("Valor pago: R$ %.2f\n",valorPago);
            System.out.println("Pagando realizado com sucesso");
        } else {
            System.out.println("Tipo de pagamento: "+tipoPagamento.getTipo());
            valorPago -= valorPago * 0.15;
            System.out.printf("Valor pago: R$ %.2f\n",valorPago);
            System.out.println("Pagando realizado com sucesso");
        }
    }
}

package ListaExerciciosDio.SistemaDeLojaVirtual.dominio;

import ListaExerciciosDio.SistemaDeLojaVirtual.enums.FormaDePagamento;

public class Pedido {
    protected Carrinho carrinho;
    protected String tipoPagamento;
    private double valorTotal;


    public Pedido(Carrinho carrinho, String tipoPagamento) {
        adicionarCarrinho(carrinho);
        this.tipoPagamento = tipoPagamento;
        valorCarrinho();
        pagamento();

    }

    public void adicionarCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public void valorCarrinho() {
        this.valorTotal = carrinho.calcularTotal();
    }
    public void pagamento() {
        this.valorTotal = FormaDePagamento.pagamento(tipoPagamento, valorTotal);
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    @Override
    public String toString() {
        return carrinho+"\n"
                +"Tipo de pagamento: "+tipoPagamento+"\n"
                +"Valor total: R$ "+valorTotal;
    }
}

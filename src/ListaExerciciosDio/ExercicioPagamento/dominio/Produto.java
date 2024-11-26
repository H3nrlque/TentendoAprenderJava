package ListaExerciciosDio.ExercicioPagamento.dominio;


import ListaExerciciosDio.ExercicioPagamento.enums.TipoPagamento;

public abstract class Produto extends Pagamento{
    protected String nome;
    protected double valor;
    protected String tipoPagamento;

    public Produto(String nome, double valor, String tipoPagamento) {
        this.nome = nome;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    @Override
    public double tipoPagamento() {
        TipoPagamento.tipoPagamentoPorNome(tipoPagamento);
        switch (TipoPagamento.tipoPagamentoPorNome(tipoPagamento)) {
            case 1 -> {
                return credito(valor);
            }
            case 2 -> {
                return debito(valor);
            }

            case 3 -> {
                return dinheiroOuPix(valor);
            }

            case 4 -> {
                return creditoParceladoEm2(valor);
            }

            case 5 -> {
                return creditoParceladoEm3OuMai(valor);
            }
            default -> {
                return 0;
            }
        }
    }
}

package ListaExerciciosDio.SistemaDeLojaVirtual.enums;

import ListaExerciciosDio.SistemaDeLojaVirtual.interfaces.FormasDePagamento;

public enum FormaDePagamento implements FormasDePagamento {
    DINHEIRO(1, "dinheiro"),
    CREDITO(2, "crédito"),
    DEBITO(3, "débito");

    private int valor;
    private String tipoPagamento;

    FormaDePagamento(int valor, String tipoPagamento) {
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    public static int TipoPagamento(String tipoPagamento) {
        for (FormaDePagamento pagamento : values()) {
            if (pagamento.tipoPagamento.equals(tipoPagamento)) {
                return pagamento.valor;
            }
        }
        return 0;
    }

    public  static double pagamento(String tipoPagamento, double valor) {
        switch (TipoPagamento(tipoPagamento)) {
            case 1 -> {
                return DINHEIRO.dinheiro(valor);
            }

            case 2 -> {
                return CREDITO.credito(valor);
            }

            case 3 -> {
                return DEBITO.debito(valor);
            }
        }
        return 0;
    }


    @Override
    public double dinheiro(double valor) {
        return valor -= valor * 0.10;
    }

    @Override
    public double credito(double valor) {
        return valor;
    }

    @Override
    public double debito(double valor) {
        return valor - valor * 0.05;
    }


}

package ListaExerciciosDio.ExercicioPagamento.dominio;

import ListaExerciciosDio.ExercicioPagamento.enums.TipoPagamento;

public class Computador extends Produto{
    public Computador(String nome, double valor, String tipoPagamento) {
        super(nome, valor, tipoPagamento);
    }


    public double tipoPagamento() {
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

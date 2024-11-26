package ListaExerciciosDio.ExercicioPagamento.dominio;


import ListaExerciciosDio.ExercicioPagamento.interfaces.Calculavel;

public abstract class Pagamento implements Calculavel {
    private Produto produto;


    @Override
    public double credito(double valor) {
        return valor -= valor * 0.05;
    }

    @Override
    public double debito(double valor) {
        return valor -= valor * 0.10;
    }

    @Override
    public double dinheiroOuPix(double valor) {
        return valor -= valor * 0.15;
    }

    @Override
    public double creditoParceladoEm2(double valor) {
        return valor;
    }

    @Override
    public double creditoParceladoEm3OuMai(double valor) {
        return valor += valor * 0.10;
    }
}

package ListaExerciciosDio.ExercicioPagamento.interfaces;

public interface Calculavel {
    double tipoPagamento();

    double credito(double valor);

    double debito(double valor);

    double dinheiroOuPix(double valor);

    double creditoParceladoEm2(double valor);

    double creditoParceladoEm3OuMai(double valor);
}

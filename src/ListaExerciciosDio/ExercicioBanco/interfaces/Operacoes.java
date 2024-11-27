package ListaExerciciosDio.ExercicioBanco.interfaces;

public interface Operacoes {
    void depositar(double valor);
    void sacar(double valor);
    double saldoAtual();
}

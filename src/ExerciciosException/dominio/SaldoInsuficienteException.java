package ExerciciosException.dominio;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super("Saldo insuficiente");
    }
}

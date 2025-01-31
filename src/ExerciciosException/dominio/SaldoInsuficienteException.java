package ExerciciosException.dominio;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        System.out.println("Withdraw error: Not enough balance");
    }
}

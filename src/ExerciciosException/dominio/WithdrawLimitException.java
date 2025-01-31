package ExerciciosException.dominio;

public class WithdrawLimitException extends Exception {
    public WithdrawLimitException() {
        System.out.println("Withdraw error: The amount exceeds withdraw limit");
    }
}

package ExerciciosException.dominio;

public class Account {
    private Integer numero;
    private String holder;
    private double balance;
    private double withdrawKimit;

    public Account(Integer numero, String holder, double balance, double withdrawKimit) {
        this.numero = numero;
        this.holder = holder;
        this.balance = balance;
        this.withdrawKimit = withdrawKimit;
    }

    public void deposit(double amount) {
        if (amount == 0) {
            System.out.println("O valor não pode ser 0");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) throws WithdrawLimitException, SaldoInsuficienteException {
        if (validarWithdraw(amount)) {
            balance -= amount;
        }
    }

    public boolean validarWithdraw(double amount) throws WithdrawLimitException, SaldoInsuficienteException {
        if (amount <= balance && amount <= withdrawKimit) {
            return true;
        } else if (amount >= withdrawKimit) {
            throw new WithdrawLimitException();
        } else if (amount > balance) {
            throw new SaldoInsuficienteException();
        }
        return false;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawKimit() {
        return withdrawKimit;
    }

    public void setWithdrawKimit(double withdrawKimit) {
        this.withdrawKimit = withdrawKimit;
    }
}

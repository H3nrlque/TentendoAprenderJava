package ExerciciosParte01.dominio;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber != null) {
            this.accountNumber = accountNumber;
        }
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("O saldo não pode ser negativo");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account: "+accountNumber+"\n"
                +"Balance: R$ "+balance;
    }
}

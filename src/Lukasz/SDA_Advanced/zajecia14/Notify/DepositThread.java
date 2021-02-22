package Lukasz.SDA_Advanced.zajecia14.Notify;

public class DepositThread extends Thread {

    private BankAccount bankAccount;
    private Double amount;

    public DepositThread(BankAccount bankAccount, Double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        bankAccount.deposit(amount);
    }

}

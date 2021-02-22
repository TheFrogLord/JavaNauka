package Lukasz.SDA_Advanced.zajecia14.Notify;

public class WithdrawThread extends Thread {

    private BankAccount bankAccount;
    private Double amount;

    public WithdrawThread(BankAccount bankAccount, Double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(amount);
    }
}

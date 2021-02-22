package Lukasz.SDA_Advanced.zajecia14.Notify;

public class Main {
    public static void main(String[] args) throws InterruptedException {

    BankAccount bankAccount = new BankAccount(100.0);
    Thread withdrawTh = new WithdrawThread(bankAccount, 500.0);
        withdrawTh.start();
        Thread.sleep(2000L);

    Thread deposit = new DepositThread(bankAccount, 200.0);
        deposit.start();
        Thread.sleep(2000L);

    Thread deposit2 = new DepositThread(bankAccount, 300.0);
        deposit2.start();
    }
}

package Lukasz.SDA_Advanced.zajecia14.Notify;

public class BankAccount {

    private Double balance;

    public BankAccount(Double balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(double amount) {
        while (balance < amount) {
            System.out.println("Brak wystarczajacych srodkow na koncie");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Przelew wyjsciowy udany");
        balance = balance - amount;
    }

    public synchronized void deposit(double amount) {
        System.out.println("Wplata na konto");
        balance += amount;
        notifyAll();
    }

}

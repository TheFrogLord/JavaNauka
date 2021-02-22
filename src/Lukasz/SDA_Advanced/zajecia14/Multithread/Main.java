package Lukasz.SDA_Advanced.zajecia14.Multithread;

public class Main {
    public static void main(String[] args) {

        System.out.println("Watek glowny " + Thread.currentThread().getId());

        Counter counter = new Counter(0);

        IncrementThread incrementThread1 = new IncrementThread(counter);
        IncrementThread incrementThread2 = new IncrementThread(counter);

        incrementThread1.start();
        incrementThread2.start();
    }
}
package Lukasz.SDA_Advanced.zajecia14.Multithread.Zadanie1;

public class ThreadName implements Runnable{
    private String name;

    @Override
    public void run() {
        System.out.println("Name " + Thread.currentThread().getName());
    }
}

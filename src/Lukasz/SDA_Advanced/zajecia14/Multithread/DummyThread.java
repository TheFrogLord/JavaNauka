package Lukasz.SDA_Advanced.zajecia14.Multithread;

public class DummyThread extends Thread{
    @Override
    public void run() {
        System.out.println("Jestem wykonaniem watku "
                + Thread.currentThread().getId());
    }

}

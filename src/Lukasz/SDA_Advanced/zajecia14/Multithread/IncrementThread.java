package Lukasz.SDA_Advanced.zajecia14.Multithread;

public class IncrementThread extends Thread{

    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            counter.increment();
            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Counter " + counter.getCount());
    }

}

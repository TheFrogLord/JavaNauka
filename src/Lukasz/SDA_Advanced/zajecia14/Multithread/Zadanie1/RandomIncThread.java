package Lukasz.SDA_Advanced.zajecia14.Multithread.Zadanie1;

import java.util.Random;

public class RandomIncThread extends Thread{

    private Counter counter;

    public RandomIncThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomInt = random.nextInt(100);
            if (randomInt % 2 == 0) {
                counter.increment();
            } else {
                counter.decrement();
            }
        }

    }

}

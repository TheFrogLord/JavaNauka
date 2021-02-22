package Lukasz.SDA_Advanced.zajecia14.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 20; i++) {
            executorService.submit(() -> {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Jestem taskiem, ktory sie laczy");
            });
        }
        System.out.println("Bezpieczne zamkniecie executora");
        executorService.shutdown();
    }
}

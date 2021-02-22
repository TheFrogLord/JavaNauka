package Lukasz.SDA_Advanced.zajecia14.ExecutorService;

import java.util.concurrent.*;

public class ScheduleMain {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        ScheduledFuture<String> future =
                executorService.schedule(() -> "Odpowiedz z mojego callable", 5, TimeUnit.SECONDS);

        System.out.println("To powinno sie wyswietlic od razu");
        try {
            String odpowiedz = future.get();
            System.out.println("Odpowiedz " + odpowiedz);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

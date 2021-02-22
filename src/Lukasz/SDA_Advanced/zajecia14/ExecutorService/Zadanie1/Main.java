package Lukasz.SDA_Advanced.zajecia14.ExecutorService.Zadanie1;

import java.util.Scanner;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
        while (true) {
            System.out.println("Podaj liczbe a za 5 sekund wyswietle jej kwadrat");
            String input = scanner.nextLine();
            if ("@".equals(input)) {
                break;
            }
            int number = Integer.parseInt(input);

            executorService.schedule(
                    () -> System.out.println("Kwadrat " + number + "="+ Math.pow(number, 2)), 5, TimeUnit.SECONDS);
        }
        executorService.shutdown();
    }
}

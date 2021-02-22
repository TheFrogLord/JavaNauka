package Lukasz.HomeWork.Advanced.Zajecia14_Threads_IO.Zadanie1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
        Napisz program, który co 10 min sprawdzi czy w określonej w kodzie programu
        (dowolnej) ścieżce znajduje się plik, odczyta go i wyświetli ile znaków jest w pliku -
        wykorzystaj executorService z programowania wielowątkowego i odczytywanie plików z
        NIO
         */

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        Path fileToRead = Paths.get("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/PracaDomowa/pliki/plik.txt");

        BufferedReader read = Files.newBufferedReader(fileToRead);
        ScheduledFuture<IntSummaryStatistics> future =
                executorService.schedule(() -> read.lines().collect(Collectors.summarizingInt(String::length)), 10, TimeUnit.MINUTES);
        System.out.println("Nastąpiło wczytanie pliku");

        try {
            System.out.println("Ilość znaków w pliku " + future.get());

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

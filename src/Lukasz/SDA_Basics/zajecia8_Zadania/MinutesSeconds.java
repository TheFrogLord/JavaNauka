package Lukasz.SDA_Basics.zajecia8_Zadania;

import java.util.Scanner;

public class MinutesSeconds {

    public static void main(String[] args) throws InterruptedException {

// Pobranie od użytkownika wielkość do odliczania

        System.out.println("Proszę podać liczbę minut:");
        int minutes = new Scanner(System.in).nextInt();

        System.out.println("Proszę podać liczbę sekund:");
        int sec = new Scanner(System.in).nextInt();

        MinutesSeconds result = new MinutesSeconds();
        result.counter(minutes, sec);

    }

    // Pętla do while do odliczania czasu.
    public void counter(int minutes, int sec) throws InterruptedException {
        do {
            System.out.println(minutes + " min " + sec-- + " sec left");
            Thread.sleep(1000);

            if (sec == 0) {
                minutes--;
                sec += 60;
            }

        } while (minutes >= 0 && sec >= 0);
        System.out.println("Stop!");
    }
}

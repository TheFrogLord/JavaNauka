package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie9;

import java.util.Scanner;

public class MainWave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WavePattern result = new WavePattern();

        System.out.println("Proszę podać ilość wierszy: ");
        int numberOfRows = sc.nextInt();

        System.out.println("Proszę podać długość fali: ");
        int waveLength = sc.nextInt();

//Start stopera
        long start = System.currentTimeMillis();
        result.wavePattern(numberOfRows, waveLength);
//Stop plus wynik
        long stop = System.currentTimeMillis() - start;
        System.out.println("Stoper: " + stop + " millis");
    }
}




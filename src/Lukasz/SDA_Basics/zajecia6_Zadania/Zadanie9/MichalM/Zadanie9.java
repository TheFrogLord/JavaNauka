package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie9.MichalM;

import java.util.Scanner;

public class Zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę wierszy: ");
        int row = scanner.nextInt();
        int column = row * 2;
        System.out.println("Podaj liczbę znaków w linii");
        int numberOfSigns = scanner.nextInt();

        //Start stopera
        long start = System.currentTimeMillis();

        int numberOfRepetitions = (numberOfSigns / column) + 1;
        for (int i = 0; i < row; i++) {
            String result = "";
            for (int j = 0; j < numberOfRepetitions; j++) {
                result += printWave(i, column);
            }
            System.out.println(result.substring(0, numberOfSigns));
        }
        //Stop plus wynik
        long stop = System.currentTimeMillis() - start;
        System.out.println("Stoper: " + stop + " milisekund");
    }
    public static String printWave(int row, int column) {
        String wave = "";
        for (int j = 0; j < column; j++) {
            if (j == row || j == ((column - 1) - row)) {
                wave += "*";
            } else {
                wave += " ";
            }
        }
        return wave;
    }
}

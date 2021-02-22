package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie11;

import java.util.Scanner;

public class Starczy {

    Scanner sc = new Scanner(System.in);

    public void longestSentence(String text) {

        String temp = " ";

        for (; ; ) {

            if (text.equals("Starczy")) {
                System.out.println("Koniec programu.");
                break;
            }

            if (text.length() > temp.length()) {
                temp = text;

            } else text = sc.nextLine();
        }
        System.out.print("Najdłuższe zdanie to: " + '(' + temp + ')');
    }
}

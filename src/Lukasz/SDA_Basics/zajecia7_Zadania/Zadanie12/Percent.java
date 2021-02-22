package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie12;

import java.util.Scanner;

public class Percent {

    double counter = 0;

    public void space() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać tekst:");
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {
                counter++;
            }
        }
        double percent = (counter / text.length()) * 100;

        System.out.println("Wynik:" + percent);
    }
}

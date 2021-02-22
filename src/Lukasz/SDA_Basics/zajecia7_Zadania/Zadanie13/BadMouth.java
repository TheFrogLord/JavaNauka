package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie13;

import java.util.Scanner;

public class BadMouth {

    Scanner sc = new Scanner(System.in);

    public void textRepeat() {

        System.out.println("Proszę podać tekst:");
        String text = sc.nextLine();

        String[] outText = text.split(" ");

        for (String s : outText) {
            System.out.print(s + " " + s + " ");
        }
    }
}

package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać tekst:");

        String text = sc.nextLine();
        Starczy length = new Starczy();

        length.longestSentence(text);
    }
}

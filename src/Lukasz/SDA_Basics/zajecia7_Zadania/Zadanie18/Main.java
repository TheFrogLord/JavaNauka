package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie18;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać tekst:");

        String text = sc.nextLine();

        Validate.aSiu(text);


    }
}

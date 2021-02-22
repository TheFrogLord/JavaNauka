package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Proszę podać liczbę:");
        int inputNumber = sc.nextInt();

        LessMany game = new LessMany();
        game.compare(inputNumber);

    }
}

package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie4;

import java.util.Scanner;

public class PifPaf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać liczbę:");

        int number = sc.nextInt();
        PifPafMethod result = new PifPafMethod();
        result.pifPaf(number);
    }
}

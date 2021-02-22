package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie1;

import java.util.Scanner;

public class Diameter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float pi = (float) Math.PI;

        System.out.println("Proszę podać średnicę okręgu:");
        float diD = sc.nextFloat();

//Wzór na obwód
        float r = diD / 2;
        float result = 2 * pi * r;

//Wynik
        System.out.println("Wartość obwodu wynosi: " + result);

    }
}

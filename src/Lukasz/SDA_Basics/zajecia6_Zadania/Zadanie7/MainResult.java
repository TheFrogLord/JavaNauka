package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie7;

import java.util.Scanner;

public class MainResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać liczbę: ");
        int random = sc.nextInt();

        int result = Fibonacci.get(random);
        System.out.println(result);
    }
}

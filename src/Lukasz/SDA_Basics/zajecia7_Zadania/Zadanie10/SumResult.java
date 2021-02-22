package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie10;

import java.util.Scanner;

public class SumResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać liczbę: ");
        int number = sc.nextInt();

        Calculate sum = new Calculate();
        sum.calc(number);



    }




}

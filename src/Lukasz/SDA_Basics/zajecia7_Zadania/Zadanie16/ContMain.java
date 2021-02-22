package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie16;

import java.util.Scanner;

public class ContMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.print("Proszę podać liczbę");

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = sc.nextInt();
        }
            NumberContinue result = new NumberContinue();

            result.numberCont(numbers);

        }
    }

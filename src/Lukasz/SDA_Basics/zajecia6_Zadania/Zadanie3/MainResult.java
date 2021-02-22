package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie3;

import java.util.Scanner;

public class MainResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać współczynnik a:");
        int a = sc.nextInt();

        System.out.println("Proszę podać współczynnik b:");
        int b = sc.nextInt();

        System.out.println("Proszę podać współczynnik c:");
        int c = sc.nextInt();

        Delta finish = new Delta();
        finish.result(a, b, c);





    }
}

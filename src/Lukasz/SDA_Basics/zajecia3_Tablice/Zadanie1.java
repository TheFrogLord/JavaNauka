package Lukasz.SDA_Basics.zajecia3_Tablice;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Proszę podać wilekość tablicy:");
            int random = sc.nextInt();
            sc.nextLine();

        String[] tab = new String[random];

        for (int i = 0; i <= tab.length - 1; i++) {
            System.out.println("Proszę podać wartość zmiennej:");
            tab[i] = sc.nextLine();

        }

        for (int j = tab.length - 1; j >= 0; j--) {
            System.out.print(tab[j] + ", ");

        }
    }
}

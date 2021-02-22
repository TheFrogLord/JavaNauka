package Lukasz.SDA_Basics.zajecia3_Tablice;

import java.util.Arrays;

public class Zadanie14 {

    public static void main(String[] args) {

        int[] tab = {2, 5, 5, 4, 7, 2, 0, 6};
        int[] tab1 = new int[8];

        for (int i = 0; i < tab.length; i++) {
            tab1[i] = tab[i];
        }
            System.out.println("Tablica pierwsza: " + Arrays.toString(tab));
            System.out.print("Tablica druga: " + Arrays.toString(tab1));

        /*for (int i = 0; i < tab.length; i++) {
            System.out.print(Arrays.toString(tab));
        }
            System.out.println();
            System.out.println("Tablica druga:");

        for (int i = 0; i < tab1.length; i++) {
            System.out.print(Arrays.toString(tab1));

        }

         */



    }
}

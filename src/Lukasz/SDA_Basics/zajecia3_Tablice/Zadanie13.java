package Lukasz.SDA_Basics.zajecia3_Tablice;

import java.util.Arrays;

public class Zadanie13 { //Stworzenie "bubble sort"

    public static void main(String[] args) {

        double[] tab = {2, -1, 1.52, 0, 3.4, 2.3, -1.83, 0.01};
        double temp;

        for (int i = 0; i < tab.length; i++) {

            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    temp = tab[j + 1];
                    tab[j + 1] = tab[j];
                    tab[j] = temp;
                }

            }
            //System.out.println(Arrays.toString(tab));
        }
        System.out.println(Arrays.toString(tab));
    }
}

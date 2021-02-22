package Lukasz.SDA_Basics.zajecia3_Tablice;

import java.util.Arrays;

public class Zadanie15 {

    public static void main(String[] args) {

        int[] tab = {3, 6, 10, 44, 32, 86, 0, 12};

        int[] tabCopy = Arrays.copyOf(tab, tab.length);

        tabCopy[1] = (int) (Math.random() * ((20 - 1) + 1));

        if (tabCopy[1] > tab.length) {
            System.out.println("Drugi parametr jest większy od długości tablicy");
        }
        if (tabCopy[1] < tab.length) {
            System.out.println("Drugi parametr jest mniejszy od długości tablicy");
        }
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(tabCopy));
    }
}

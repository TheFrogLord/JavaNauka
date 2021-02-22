package Lukasz.HomeWork.Advanced.Generic.Zadanie1;

import java.util.Arrays;

public class ArrayOperation {

    public static <T> void swapIndex(T[] array, int indexA, int indexB) {
        System.out.println("Tablica pierwotna: " + Arrays.toString(array));

        T temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;

        System.out.println("Tablica po zmianie: " + Arrays.toString(array));
    }
}

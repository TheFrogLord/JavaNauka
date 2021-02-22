package Lukasz.HomeWork.Advanced.Interface_enums.ZadanieDod;

import java.util.Arrays;

public class BubbleSort {

    public static <T extends Comparable<T>> void bubble(T[] array) {
        T temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(array));
    }
}

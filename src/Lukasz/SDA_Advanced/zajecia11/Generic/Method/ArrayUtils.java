package Lukasz.SDA_Advanced.zajecia11.Generic.Method;

public class ArrayUtils {

    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array.length == 0) {
            return null;
        }
        T currentMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(currentMax) > 0) {
                currentMax = array[i];
            }
        }

        return currentMax;
    }

    public static <T> void showArray(T[] array) {
        for (T arrays : array) {
            System.out.print(arrays + ", ");
        }
    }

    public static <T extends Comparable<T>> T findMin(T[] array) {
        if (array.length == 0) {
            return null;
        }
        T currentMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(currentMin) < 0) {
                currentMin = array[i];
            }
        }
        return currentMin;
    }

    public static <T extends Comparable<T>> void findBigger(T[] array, T param) {
        for (T arrays : array) {
            if (arrays.compareTo(param) > 0) {
                System.out.print(arrays + ", ");
            }
        }
    }
}

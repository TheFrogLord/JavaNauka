package Lukasz.HomeWork.Advanced.Generic.Zadanie6;

public class ArrayUtils {

    public static <T extends Comparable<T>> T nextBiggest(T[] array) {
        T max = array[0];
        int count = 0;
        for (T t : array) {
            if (t.compareTo(max) > 0) {
                max = t;
                count++;
            }
            if (count == 2) {
                return max;
            }
        }
        return max;
    }
}

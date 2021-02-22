package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie14;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[100];
        Random random = new Random();
        ArrayOfNumbers list = new ArrayOfNumbers(Arrays.asList(array));

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(120);
        }

        /*//1.
        System.out.println("Lista unikalnych elementów: ");
        list.uniqueElementsList();
        System.out.println();

        //2.
        System.out.println("Lista elementów powtarzających się minimum jeden raz: ");
        list.doubledElementsList();*/

        //3.
        list.doubledElementsList();
        ArrayOfNumbers list2 = new ArrayOfNumbers(list.replaceDuplicates());
        System.out.println("Lista duplikatów: ");
        list2.doubledElementsList();

    }
}

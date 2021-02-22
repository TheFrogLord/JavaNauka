package Lukasz.HomeWork.Advanced.Exceptions.Zadanie3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayIndex result = new ArrayIndex();
        int[] array = {1, 5, 18, -3};

        System.out.println("Give index value: ");
        int index = sc.nextInt();

        result.indexValue(array, index);
    }
}

package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie7;

public class Fibonacci {

    public static int get(int index) {

        int first = 0;
        int second = 1;

        for (int i = 0; i < index - 1; i++) {

            int temp = first + second;
            first = second;
            second = temp;

        }
        return second;
    }

}

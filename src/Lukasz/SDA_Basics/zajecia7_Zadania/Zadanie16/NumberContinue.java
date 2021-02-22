package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie16;

public class NumberContinue {

    public void numberCont(int[] values) {

        int counter = 0;
        int max = 1;
        int previous = values[0] - 1;

        for (int i = 0; i < values.length; i++) {

            if (values[i] > previous) {
                counter++;

            }
            else if (max < counter) {
                max = counter;
                counter = 0;
            }
            previous = values[i];

        }
        System.out.println(max);
    }
}


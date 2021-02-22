package Lukasz.HomeWork.Basics.Zestaw2.Zadanie2;

public class Zadanie2 {

    public static void main(String[] args) {

        String data = "25, 15, 64, 4";
        String[] outData = splitter(data);

        int[] array = project(outData);
        System.out.println();

        int result = counter(array);
        System.out.println("Liczb większych od 10 jest: " + result);
    }

    public static String[] splitter(String data) {
        return data.split(", ");
    }

    public static int[] project(String[] outData) {
        int[] array = new int[outData.length];

        for (int i = 0; i < outData.length; i++) {
            //System.out.println(outData[i]); - if i want to print String array. But no need.
            array[i] = Integer.parseInt(outData[i]);
                /*
                In the example we were supposed to use Integer.valueOf.
                But i choose parseInt for return primitive int not an object Integer.
                */
            System.out.print(array[i] + ", ");
        }
        return array;
    }

    public static int counter(int[] array) {
        int count = 0;

        for (int number : array) {
            if (number > 10) {
                count++;
            }
        }
        return count;
    }
}

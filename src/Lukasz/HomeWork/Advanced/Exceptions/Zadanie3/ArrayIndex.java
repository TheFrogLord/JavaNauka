package Lukasz.HomeWork.Advanced.Exceptions.Zadanie3;

public class ArrayIndex {

    public void indexValue(int[] array, int number) {
        try {
            System.out.println(array[number]);

        } catch (IndexOutOfBoundsException | NullPointerException ex) {
            System.out.println("Invalid index number.");
            ex.printStackTrace();
        }
    }
}

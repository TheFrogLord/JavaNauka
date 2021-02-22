package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie8;

public class Main {
    public static void main(String[] args) {

        /*
        private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;
         */
        Parcel input = new Parcel(15, 30, 45, 34.5f, true);
        System.out.println(input.validate(input));

    }
}

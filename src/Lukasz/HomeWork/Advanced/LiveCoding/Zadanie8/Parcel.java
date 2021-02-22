package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie8;

public class Parcel implements Validator {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate(Parcel input) {
        System.out.println(validateArgs(xLength, yLength, zLength));
        System.out.println();
        System.out.println(validateIsExpress(isExpress));
        System.out.println();
        System.out.print("Czy każdy z wymiarów nie jest mniejszy od 30? ");
        return xLength >= 30 && yLength >= 30 && zLength >= 30;

    }

    public boolean validateArgs(int x, int y, int z) {
        System.out.print("Czy suma x,y,z nie przekracza 300? ");
        return (xLength + yLength + zLength) <= 300;

    }

    public boolean validateIsExpress(boolean express) {
        System.out.print("Czy waga nie przekracza limitu? ");
        if (express) {
            return weight <= 15;
        } else {
            return weight <= 30;
        }
    }
}

package Lukasz.HomeExercises.Callenge_377;

public class Boxes {

    public void fitBoxesInCrest(int X, int Y, int x, int y) {

        int axisXFit = X / x;
        int axisYFit = Y / y;

        int result = axisXFit * axisYFit;
        System.out.println("fit1" + "(" + X + ", " + Y + ", " + x + ", " + y + ") " + "=> " + result);
    }
}

package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie20;

public class Hexagon extends Shape {

    private double a;

    public Hexagon(double a) {
        this.a = a;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Hexagon perimeter [cm]:");
        return 6 * a;
    }

    @Override
    public double calculateArea() {
        System.out.println("Hexagon area [cm2]:");
        double licznik = 3 * Math.sqrt(3);
        double aPow = Math.pow(a, 2);
        return (licznik / 3) * aPow;
    }
}

package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie20;

public class Rectangle extends Shape {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Rectangle perimeter [cm]:");
        return (2 * a) + (2 * b);
    }

    @Override
    public double calculateArea() {
        System.out.println("Rectangle area [cm2]:");
        return a * b;
    }
}

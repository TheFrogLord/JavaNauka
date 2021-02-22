package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie20;

public class Triangle extends Shape {

    private double h;
    private double triangleBase;
    private double b;
    private double c;

    public Triangle(double h, double triangleBase, double b, double c) {
        this.h = h;
        this.triangleBase = triangleBase;
        this.b = b;
        this.c = c;
    }



    @Override
    public double calculatePerimeter() {
        System.out.println("Triangle perimeter [cm]:");
        return triangleBase + b + c;
    }

    @Override
    public double calculateArea() {
        System.out.println("Triangle area [cm2]:");
        return (triangleBase / 2) * h;
    }
}

package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie20;

public class Main {
    public static void main(String[] args) {

        Rectangle one = new Rectangle(15, 10);
        System.out.println(one.calculatePerimeter());

        Triangle triangle = new Triangle(5, 3.5, 4, 4);
        System.out.println(triangle.calculateArea());

        Hexagon hexagon = new Hexagon(6.5);
        System.out.printf("%.2f", hexagon.calculateArea());
    }
}

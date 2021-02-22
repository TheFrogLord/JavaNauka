package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie9;

import Lukasz.HomeWork.Advanced.LiveCoding.Zadanie10.MoveDirection;

public class Main {
    public static void main(String[] args) {
        Point2D point = new Point2D(10, 12);
        Point2D center = new Point2D(0, 8);
        Circle circle = new Circle(center, point);

        System.out.printf("%s: %.2f %s", "Radius", circle.getRadius(), "\n");
        System.out.printf("%s: %.2f %s", "Perimeter", circle.getPerimeter(), "\n");
        System.out.printf("%s: %.2f %s", "Area: ", circle.getArea(), "\n");

        MoveDirection moveDirection = new MoveDirection(3, 4);
        point.move(moveDirection);
        center.move(moveDirection);

        System.out.println(center.getX());
        System.out.println(center.getY());

        System.out.printf("%.2f %s", circle.getRadius(), "\n");
        circle.resize(1.5);

        System.out.printf("%.2f %s", circle.getRadius(), "\n");


    }
}

package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie9;

import Lukasz.HomeWork.Advanced.LiveCoding.Zadanie10.Movable;
import Lukasz.HomeWork.Advanced.LiveCoding.Zadanie10.MoveDirection;

public class Point2D implements Movable {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" +
                x +
                ", " + y +
                ')';
    }

    @Override
    public void move(MoveDirection moveDirection) {
        double a = moveDirection.getX();
        double b = moveDirection.getY();

        this.x = x + a;
        this.y = y + b;
    }
}

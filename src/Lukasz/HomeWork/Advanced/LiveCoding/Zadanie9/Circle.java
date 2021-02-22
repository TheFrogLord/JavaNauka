package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie9;

import Lukasz.HomeWork.Advanced.LiveCoding.Zadanie10.Movable;
import Lukasz.HomeWork.Advanced.LiveCoding.Zadanie10.MoveDirection;
import Lukasz.HomeWork.Advanced.LiveCoding.Zadanie11.Resizable;

import java.util.ArrayList;
import java.util.List;

public class Circle implements Movable, Resizable {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        double r;
        double powA = Math.pow(center.getX() - point.getX(), 2);
        double powB = Math.pow(center.getY() - point.getY(), 2);
        r = Math.sqrt(powA + powB);

        return r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public List<Point2D> getSlicePoints() {
        List<Point2D> pointsList = new ArrayList<>();
        double x = point.getX();
        double y = point.getY();

        pointsList.add(new Point2D(x, y));
        pointsList.add(new Point2D(x, -y));
        pointsList.add(new Point2D(-x, -y));
        pointsList.add(new Point2D(-x, y));

        return pointsList;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.setX(center.getX());
        center.setY(center.getY());
        point.setX(point.getX());
        point.setY(point.getY());
    }

    @Override
    public void resize(double resizeFactor) {
        point.setX(point.getX() * resizeFactor);
        point.setY(point.getY() * resizeFactor);
    }
}

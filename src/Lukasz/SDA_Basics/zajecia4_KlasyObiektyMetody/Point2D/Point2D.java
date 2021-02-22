package Lukasz.SDA_Basics.zajecia4_KlasyObiektyMetody.Point2D;

public class Point2D {

    private int x;
    private int y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX() {
        this.x = x;
    }

    public void setY() {
        this.y = y;
    }


    public double distance(Point2D otherPoint2D) {

        return (Math.sqrt((Math.pow((otherPoint2D.x - this.x), 2)) + Math.pow((otherPoint2D.y - this.y), 2)));
    }
}

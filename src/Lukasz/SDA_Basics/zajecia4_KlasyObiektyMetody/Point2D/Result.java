package Lukasz.SDA_Basics.zajecia4_KlasyObiektyMetody.Point2D;

public class Result {

    public static void main(String[] args) {

        Point2D point1 = new Point2D(3, 4);
        Point2D point2 = new Point2D(5, 2);

        double distance = point1.distance(point2); // wynik powinien być w rodzaju "int" ale wynik nie będzie dokładny.

        System.out.println(distance);
    }
}

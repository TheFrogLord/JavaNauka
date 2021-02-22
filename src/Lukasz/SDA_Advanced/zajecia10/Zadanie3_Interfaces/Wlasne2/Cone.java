package Lukasz.SDA_Advanced.zajecia10.Zadanie3_Interfaces.Wlasne2;

public class Cone implements GeometricSpatialFigure{

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void wallsFieldCalculate(double a, double b, int numberOfWalls) {

    }

    @Override
    public void volumeCalculate(double height) {
        double base = Math.PI * Math.pow(radius, 2);
        double volume = (base / 3) * height;
        System.out.println("Cone volume: " + volume);

    }
}

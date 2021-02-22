package Lukasz.SDA_Advanced.zajecia10.Zadanie3_Interfaces.Wlasne2;

public class Cube implements GeometricSpatialFigure{

    private double a;
    private double b;
    private int numberOfWalls;
    private double height;

    public Cube(double a, double b, int numberOfWalls, double height) {
        this.a = a;
        this.b = b;
        this.numberOfWalls = numberOfWalls;
        this.height = height;
    }

    @Override
    public void wallsFieldCalculate(double a, double b, int numberOfWalls) {
        double wallField = Math.pow(a, 2);
        double wallsSum = wallField * numberOfWalls;
        System.out.println("Cube walls field: " + wallsSum);

    }

    @Override
    public void volumeCalculate(double height) {
        double base = Math.pow(a, 2);
        double volume = base * height;
        System.out.println("Cube volume: " + volume);

    }
}

package Lukasz.SDA_Advanced.zajecia10.Zadanie3_Interfaces.Wlasne2;

public class Triangle implements GeometricFlatFigure{
    private double a;
    private double b;
    private double c;
    private double height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    public void fieldCalculate(double a, double b, double height) {
        double field = (a / 2) * height;
        System.out.println("Triangle field: " + field);

    }

    @Override
    public void circuitCalculate(double a, double b, double c) {
        double circuit = a + b + c;
        System.out.println("Triangle circuit: " + circuit);

    }
}

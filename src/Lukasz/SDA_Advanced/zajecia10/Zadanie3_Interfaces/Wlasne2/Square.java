package Lukasz.SDA_Advanced.zajecia10.Zadanie3_Interfaces.Wlasne2;

public class Square implements GeometricFlatFigure{

    private double a;
    private double b;
    private double height;

    public Square(double a, double b, double height) {
        this.a = a;
        this.b = b;
        this.height = height;
    }

    @Override
    public void fieldCalculate(double a, double b, double height) {
        double field = Math.pow(a, 2);
        System.out.println("Square field: " + field);

    }

    @Override
    public void circuitCalculate(double a, double b, double c) {
        double circuit = 2 * a + 2 * b;
        System.out.println("Square circuit: " + circuit);

    }
}

package Lukasz.SDA_Advanced.zajecia10.Zadanie3_Interfaces.Wlasne2;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(3, 0, 0);
        Triangle triangle = new Triangle(4.5, 5, 3, 2);

        Cube cube = new Cube(5, 0, 6, 5);
        Cone cone = new Cone(4, 7);

        square.fieldCalculate(3, 0, 0);
        triangle.fieldCalculate(4.5, 5, 3);
        square.circuitCalculate(3, 0, 0);
        triangle.circuitCalculate(4.5, 5, 3);


        cube.volumeCalculate(5);
        cone.volumeCalculate(7);
    }
}

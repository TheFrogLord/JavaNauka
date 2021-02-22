package Lukasz.SDA_Advanced.zajecia11.Exceptions_Wyjatki;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        if (a + b < c || a + c < b || b + c < a) {
            throw new TriangleCreationException();
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }
}

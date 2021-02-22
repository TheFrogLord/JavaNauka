package Lukasz.SDA_Advanced.zajecia11.Exceptions_Wyjatki;

public class Main {

    public static void main(String[] args) {

        try {
            Triangle triangle = new Triangle(1, 2, 5);
        } catch (TriangleCreationException exception) {
            System.out.println("Wystąpił błąd: " + exception.getMessage());

            exception.printStackTrace();
        } finally {
            System.out.println("Hello world!");
        }
    }
}

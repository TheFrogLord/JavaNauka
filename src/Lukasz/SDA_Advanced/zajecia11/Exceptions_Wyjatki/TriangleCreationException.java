package Lukasz.SDA_Advanced.zajecia11.Exceptions_Wyjatki;

public class TriangleCreationException extends RuntimeException {

    public TriangleCreationException() {
        super("Z tych boków nie da się zbudować trójkąta");
    }
}

package Lukasz.SDA_Advanced.zajecia11.Exceptions_Wyjatki.Zadanie1;

public class NegativeNumberException extends RuntimeException {

    public NegativeNumberException() {
        super("Podano ujemną liczbę");
    }

}

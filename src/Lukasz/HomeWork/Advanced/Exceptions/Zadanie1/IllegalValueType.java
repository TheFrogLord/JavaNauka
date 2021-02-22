package Lukasz.HomeWork.Advanced.Exceptions.Zadanie1;

public class IllegalValueType extends RuntimeException {

    public IllegalValueType() {
        super("Argument is not a number.");
    }
}


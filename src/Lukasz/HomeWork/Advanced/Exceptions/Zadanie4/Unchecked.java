package Lukasz.HomeWork.Advanced.Exceptions.Zadanie4;

public class Unchecked extends RuntimeException{

    public Unchecked() {
        super("Field is already in use.");
    }
}

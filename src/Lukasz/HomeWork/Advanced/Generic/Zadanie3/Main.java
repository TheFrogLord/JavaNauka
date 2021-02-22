package Lukasz.HomeWork.Advanced.Generic.Zadanie3;

public class Main {

    public static void main(String[] args) {
        Verse text = new Verse("Tak to ja", "Invalid variable type", "Great, valid variable type.");
        Verse numbers = new Verse(25 - 2, "Invalid variable type", "Great, valid variable type.");

        text.variableType();
        numbers.variableType();

    }
}

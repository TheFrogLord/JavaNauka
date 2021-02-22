package Lukasz.SDA_Advanced.zajecia12.Lambda.Zadanie3;

/*
Napisz wyrażenie lambda, które zamienie spacje na podkreslenia i
podniesie tekst do wielkich liter - interfejs TextOperation
 */

public class Main {
    public static void main(String[] args) {

        TextOperation change = new TextOperation() {
            @Override
            public String changeSigns(String text) {
                return text.replaceAll(" ", "_").toUpperCase();
            }
        };

        TextOperation textLambda = text ->
            text.replaceAll(" ", "_").toUpperCase();

        System.out.println(textLambda.changeSigns("Ala ma kota"));

    }
}

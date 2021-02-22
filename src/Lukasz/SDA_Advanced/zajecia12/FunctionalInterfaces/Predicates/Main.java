package Lukasz.SDA_Advanced.zajecia12.FunctionalInterfaces.Predicates;

import java.time.LocalDate;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

//Który sprawdzi czy tekst dłuższy od 30 znaków
        Predicate<String> textLengthLambda = text -> text.length() > 30;
        System.out.println(textLengthLambda.test("To nie ja byłam Ewą"));

//Który sprawdzi czy data jest datą tegoroczoną
        Predicate<LocalDate> isThisYearLambda = date -> date.getYear() == LocalDate.now().getYear();
        System.out.println(isThisYearLambda.test(LocalDate.parse("2020-12-21")));

//Który sprawdzi czy liczba jest podzielna przez 3 i 5 jednocześnie
        Predicate<Integer> numberLambda = number -> (number % 3 == 0 && number % 5 == 0);
        System.out.println(numberLambda.test(15));


    }
}

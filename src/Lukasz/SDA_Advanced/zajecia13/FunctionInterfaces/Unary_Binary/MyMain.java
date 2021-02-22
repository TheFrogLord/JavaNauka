package Lukasz.SDA_Advanced.zajecia13.FunctionInterfaces.Unary_Binary;

import java.time.LocalDate;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class MyMain {
    public static void main(String[] args) {
/*
1. UnaryOperator który skróci zdanie do 30 znaków i doda ... gdy zdanie dłuzsze
2. UnaryOperator który zwróci resztę z dzielenia przez 7 danej liczby
3. BinaryOperator który zwróci późniejszą z podanych jako parametry dat
4. BinaryOperator który połaczy dwa Stringi
5*. BinaryOperator który połączy dwa Stringi wrzucają kolejne słowa z
napisów naprzemiennie, mogą mieć różną liczbę słów !!
*/
        //1
        UnaryOperator<String> shortenSentenceLambda = text -> {
            String newText = "";
            if (text.length() > 30) {
                newText = text.substring(0, 30) + "...";
            }
            return newText;
        };
        System.out.println(shortenSentenceLambda.apply("To nie ja byłam Ewą tylko tamta Pani z łasiczką."));

        //2
        UnaryOperator<Integer> restFromDivideLambda = number -> number % 7;
        System.out.println(restFromDivideLambda.apply(25));

        //3
        BinaryOperator<LocalDate> afterDateLambda = (firstDate, secondDate) -> firstDate.isAfter(secondDate) ? firstDate : secondDate;
        System.out.println(afterDateLambda.apply(LocalDate.now(), LocalDate.now().plusMonths(3)));

        //4
        BinaryOperator<String> concat = (text1, text2) -> text1 + " " + text2;
        System.out.println(concat.apply("Ala ma kota", "Ala nie ma psa"));


    }
}

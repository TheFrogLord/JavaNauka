package Lukasz.SDA_Advanced.zajecia13.FunctionInterfaces.Unary_Binary;

import java.time.LocalDate;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        //unaryoperator ktory przesunie date o 6 miesiecy do tylu
        UnaryOperator<LocalDate> halfYearAgo = new UnaryOperator<LocalDate>() {
            @Override
            public LocalDate apply(LocalDate localDate) {
                return localDate.minusMonths(6);
            }
        };

        UnaryOperator<LocalDate> halfYearAgoLambda = localDate -> localDate.minusMonths(6);
        System.out.println(halfYearAgoLambda.apply(LocalDate.now()));

        //BinaryOperator który zwróci sumę liczb podanych jak parametr
        BinaryOperator<Integer> sum = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        BinaryOperator<Integer> sumLambda = (integer, integer2) -> integer + integer2;
        System.out.println(sumLambda.apply(3, 4));

        //Zamieni Stringa ktory kazde slowo w zdaniu skroci do 3
        UnaryOperator<String> shortenAllWords = text -> {
            String[] words = text.split(" ");
            StringBuilder newSentence = new StringBuilder();
            for (String word : words) {
                if (word.length() > 3) {
                    newSentence.append(word.substring(0, 3));
                } else {
                    newSentence.append(word);
                }
                newSentence.append(" ");
            }
            return newSentence.toString();
        };
        System.out.println(shortenAllWords.apply("Alicja ma kota"));

        //napisz binary operator, ktory w pierwszy paramterze podmieni wszystkie wystapienia drugiego na ***
        BinaryOperator<String> censor =
                (text, wordToBeCensored) -> text.replaceAll(wordToBeCensored, "***");
        System.out.println(censor.apply("Ala ma kota", "ma"));
    }
}

package Lukasz.SDA_Advanced.zajecia13.FunctionInterfaces.Comparator;

import java.time.LocalDate;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<LocalDate> compareByDayOfWeek = new Comparator<LocalDate>() {
            @Override
            public int compare(LocalDate o1, LocalDate o2) {
                return o1.getDayOfWeek().getValue() - o2.getDayOfWeek().getValue();
            }
        };
        Comparator<LocalDate> compareByDayOfWeekLambda = (o1, o2) ->
                o1.getDayOfWeek().getValue() - o2.getDayOfWeek().getValue();
        System.out.println(compareByDayOfWeekLambda.compare(LocalDate.now(), LocalDate.now().minusDays(1)));

        Comparator<String> compareByLength = (text1, text2) -> text1.length() - text2.length();
        System.out.println(compareByLength.compare("Ala ma kota", "rower"));

        Comparator<String> compareByLengthWithReadyFunction =
                Comparator.comparingInt(text -> text.length());
        System.out.println(compareByLengthWithReadyFunction.compare("Ala ma kota", "rower"));

/*
1. Napisz comparator, który porówna Stringi po liczbie cyfr jakie w
   nim wystapily (Character.isDigit)
2. Napisz comparator, który porówna daty po dniu roku (tu skorzystajcie
   z gotowego Comparator.comparingInt
3. Napisz comparator, który porówna wartość bezwzględną liczb Math.abs
*/

        //1.
        Comparator<String> howManyDigitsLambda = (text1, text2) -> countsDigit(text1) - countsDigit(text2);
        System.out.println(howManyDigitsLambda.compare("ala ma 2 koty", "tomek ma 5 kotów i 2 psy"));

        //2
        Comparator<LocalDate> compareDaysLambda =
                Comparator.comparingInt(date -> date.getDayOfYear());
        System.out.println(compareDaysLambda.compare(LocalDate.parse("2021-01-01"), LocalDate.parse("2020-04-21")));

        //3
        Comparator<Integer> absNumberLambda = (one, two) -> Math.abs(one) - Math.abs(two);
        System.out.println(absNumberLambda.compare(-1, 3));

    }

    //metoda zewnętzna dla interfejsu funkcyjnego
    private static int countsDigit(String text) {
        char[] words1 = text.toCharArray();
        int count = 0;

        for (char w1 : words1) {
            if (Character.isDigit(w1)) {
                count++;
            }
        }
        return count;
    }
}


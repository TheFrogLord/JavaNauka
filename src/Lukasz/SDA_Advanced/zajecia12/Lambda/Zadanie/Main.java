package Lukasz.SDA_Advanced.zajecia12.Lambda.Zadanie;

public class Main {

    public static void main(String[] args) {
        MathOperation dodawanie = new MathOperation() {
            @Override
            public double calculate(double a, double b) {
                return a + b;
            }
        };
        MathOperation dodawanieLambda = (a, b) -> a + b;

        MathOperation odejmowanie = new MathOperation() {
            @Override
            public double calculate(double a, double b) {
                return a - b;
            }
        };

        MathOperation odejmowanieLambda = (a, b) -> a - b;

        System.out.println(odejmowanieLambda.calculate(4, 2));

        TextOperation shortenTo10 = new TextOperation() {
            @Override
            public String change(String text) {
                return text.length() > 10 ? text.substring(0, 10) : text;
            }
        };
        //W przypadku jednego parametru moge usunac nawiaz wokol tego parametru
        TextOperation shortenTo10Lambda = text ->
                text.length() > 10 ? text.substring(0, 10) : text;

        TextOperation changeToInitials = text -> {
            String[] words = text.split(" ");
            StringBuilder initials = new StringBuilder();
            for (String word : words) {
                initials.append(word.charAt(0));
            }
            return initials.toString();
        };
        System.out.println(changeToInitials.change("Ala ma kota"));

    }
}

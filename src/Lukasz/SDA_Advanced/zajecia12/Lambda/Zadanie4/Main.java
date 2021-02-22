package Lukasz.SDA_Advanced.zajecia12.Lambda.Zadanie4;

//Napisz wyrażenie lambda, które wyrzuci z tekstu słowa krótsze niż 5 znaków

public class Main {

    public static void main(String[] args) {

        /*TextOperation change = new TextOperation() {
            @Override
            public String change(String text) {
                String[] words = text.split(" ");
                StringBuilder sb = new StringBuilder();
                for (String word : words) {
                    if (word.length() >= 5) {
                        sb.append(word).append(" ");
                    }
                }
                return sb.toString();
            }
        };*/


        TextOperation changeLambda = text -> removeShortWords(text);
        System.out.println(changeLambda.change("Ala ma kota"));

    }
    private static String removeShortWords(String text) {
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.length() >= 5) {
                sb.append(word);
            }
        }
        return sb.toString();
    }
}

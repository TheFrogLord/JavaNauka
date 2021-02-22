package Lukasz.SDA_Advanced.zajecia11.Anonymous;

public class Main {
    public static void main(String[] args) {

        TextOperation textToUpper = new TextOperation() {
            @Override
            public String change(String text) {
                return text.toUpperCase();
            }
        };
        System.out.println(textToUpper.change("Tak to ja"));

        TextOperation textLength = new TextOperation() {
            @Override
            public String change(String text) {
                if (text.length() > 30) {
                    return text.substring(0, 30) + "...";
                }
                return text;
            }
        };
        System.out.println(textLength.change("To nie ja byłam Ewą tylko Andżeliką Wniebowziętą zawsze gotową."));

        TextOperation replace = new TextOperation() {
            @Override
            public String change(String text) {
                String censor = "kurka";
                return text.replaceAll(censor, "*****");
            }
        };
        System.out.println(replace.change("Ja pierniczę kurka wodna."));

        TextOperation initials = new TextOperation() {
            @Override
            public String change(String text) {
                StringBuilder sb = new StringBuilder();
                String[] array = text.split(" ");
                for (String init : array) {
                    sb.append(init.charAt(0));
                }
                return sb.toString();
            }
        };
        System.out.println(initials.change("Jasne jak słońce"));

    }
}

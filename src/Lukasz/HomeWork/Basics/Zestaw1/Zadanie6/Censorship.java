package Lukasz.HomeWork.Basics.Zestaw1.Zadanie6;

public class Censorship {

    public static void main(String[] args) {

        String text = "Dawno dawno temu, żył sobie debil. Nie wadził nikomu, chodował kury znoszące jaja i " +
                      "wiódł spokojne, partyjne życie.";

        String result = censor(text);
        System.out.println(result);

    }

    private static String censor(String text) {
        String[] censoredWords = {"debil", "jaja", "partyjne"};
        //for (String array : censoredWords) Problem

        return text.replaceAll(censoredWords[0], "*****").
                replaceAll(censoredWords[1], "*****").replaceAll(censoredWords[2], "*****");
    }
}


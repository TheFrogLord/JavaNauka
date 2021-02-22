package Lukasz.SDA_Basics.zajecia4_StringVarargsData;

public class Strings {

    public static void main(String[] args) {

        String text = "To nie jest takie trudne.";
            int length = counter(text);

            System.out.println(length);
    }

    public static int counter(String text) {

        String newText = text.replace(" ", "");
            return newText.length();
    }
}

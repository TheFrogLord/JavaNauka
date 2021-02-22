package Lukasz.HomeWork.Basics.Zestaw1.Zadanie2;

public class StringText {

    public static void main(String[] args) {
        String inputText = "123Ala2Ma";
        String result = isNumber(inputText);
        System.out.println(result);

    }

    public static String isNumber(String text) {

        for (char digit : text.toCharArray()) {
            if (Character.isDigit(digit)) {
                System.out.print(digit);
            }
        }
        return "";
    }
}

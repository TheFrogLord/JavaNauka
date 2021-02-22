package Lukasz.HomeWork.Basics.Zestaw2.Zadanie4;

public class SpecialSign {

    private static final char[] signArray = {'!', '?', '@', '#', '&'};

    public static boolean isValid(String password) {

        for (char symbol : signArray) {

            for (char c : password.toCharArray()) {
                if (c == symbol) {
                    return true;
                }
            }
        }
        return false;

    }
}

package Lukasz.HomeWork.Basics.Zestaw2.Zadanie4;

public class Digit {

    public static boolean isValid(String password) {

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

}
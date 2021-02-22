package Lukasz.HomeWork.Basics.Zestaw2.Zadanie4;

public class UpperLetter {

    public static boolean isValid(String password) {

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

}

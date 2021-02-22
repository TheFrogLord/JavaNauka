package Lukasz.HomeWork.Basics.Zestaw2.Zadanie4;

public class Letter {

    public static boolean isValid(String password) {

        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }

}

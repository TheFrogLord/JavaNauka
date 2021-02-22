package Lukasz.HomeWork.Basics.Zestaw2.Zadanie3;

import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args) {

        String sms = Zadanie3.inputText();
        String output = replacePl(sms);
        System.out.println(output);
    }

    public static String inputText() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę wprowadzić tekst wiadomości sms:");
        String message = sc.nextLine();
        sc.close();
        return message;
    }

    public static String replacePl(String text) {
        return text.replace("ą", "a").replace("ć", "c").
                replace("ę", "e").replace("ł", "l").
                replace("ń", "n").replace("ó", "o").
                replace("ż", "z").replace("ź", "z");
    }
}

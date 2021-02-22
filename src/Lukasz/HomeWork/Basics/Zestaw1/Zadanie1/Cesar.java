package Lukasz.HomeWork.Basics.Zestaw1.Zadanie1;

import java.util.Scanner;

public class Cesar {

    //from 32("space") to 126("~") Decimal in ASCII table.

    public static void main(String[] args) {

        String inputText = Cesar.inputText();
        String keyWord = Cesar.keyword();

        Cesar cypher = new Cesar();

        String encrypText = cypher.encryption(inputText, keyWord);
        String decryptText = cypher.decryption(encrypText, keyWord);
        System.out.println(encrypText);
        System.out.println(decryptText);
    }

    public static String inputText() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę wpisać tekst do szyfrowania: ");
        return sc.nextLine();
    }

    public static String keyword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Proszę podać słowo klucz: ");
        return sc.nextLine();
    }

    public String encryption(String inputText, String keyWord) {
        int numberKey = getKey(keyWord);
        char[] chars = inputText.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = transform(chars[i], -numberKey);
        }
        return String.valueOf(chars);

    }

    public String decryption(String outputText, String keyWord) {
        int numberKey = getKey(keyWord);
        char[] chars = outputText.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = transform(chars[i], numberKey);
        }
        return String.valueOf(chars);
    }

    private int getKey(String keyWord) {
        char[] text = keyWord.toCharArray();
        int key = 0;
        for (char c : text) {
            key += c;
        }
        return key;
    }

    private char transform(char aChar, int key) {
        int number = aChar;
        number += key;
        return (char) number;
    }
}

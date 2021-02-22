package Lukasz.SDA_Advanced.zajecia12.Collections.Zadanie1;

import java.util.*;

public class MainEx2 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj slowo: ");
            String word = scanner.nextLine();
            if ("@".equals(word)) {
                break;
            }
            if (!words.contains(word)) {
                words.add(word);
            }
        }
        System.out.println("Unikalne slowa: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

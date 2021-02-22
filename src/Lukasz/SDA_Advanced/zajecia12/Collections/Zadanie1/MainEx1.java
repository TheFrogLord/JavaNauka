package Lukasz.SDA_Advanced.zajecia12.Collections.Zadanie1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainEx1 {

    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj slowo: ");
            String word = scanner.nextLine();
            if ("@".equals(word)) {
                break;
            }
            words.add(word);
        }
        System.out.println("Unikalne slowa: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

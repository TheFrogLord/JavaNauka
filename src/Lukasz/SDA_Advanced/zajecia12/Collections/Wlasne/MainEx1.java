package Lukasz.SDA_Advanced.zajecia12.Collections.Wlasne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainEx1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj zdanie: ");
        String word = sc.nextLine();
        List<String> words = new ArrayList<>();
        String[] array = word.split(" ");

        Collections.addAll(words, array);
        Collections.shuffle(words);

        System.out.println("Pomieszane zdanie: ");
        for (String w : words) {
            System.out.print(w + " ");
        }
    }
}

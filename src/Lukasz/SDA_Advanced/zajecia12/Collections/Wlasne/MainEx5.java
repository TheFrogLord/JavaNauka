package Lukasz.SDA_Advanced.zajecia12.Collections.Wlasne;
/*5. Wczytaj od użytkownika słowa aż poda @.
   5.1 Usuńmy z tej kolekcji słowa krótsze niż 3
   5.2 Wyświetlmy słowa posortowane (Collecions.sort)*/

import java.util.*;

public class MainEx5 {

    public static void main(String[] args) {
        /* moje:

        Scanner sc = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        while (true) {
            System.out.println("Podaj słowo: ");
            String word = sc.nextLine();
            if ("@".equals(word)) {
                break;
            }
            words.add(word);
        }
        Collections.sort(words);
        words.removeIf(w -> w.length() < 3);

        for (String word : words) {
            System.out.print(word + ", ");

        }
    }*/

        //trenera:
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        while (true) {
            System.out.println("Podaj slowo:");
            String word = scanner.nextLine();
            if ("@".equals(word)) {
                break;
            }
            words.add(word);
        }
        //1
        Iterator<String> wordsIterator = words.iterator();
        while (wordsIterator.hasNext()) {
            String nextWord = wordsIterator.next();
            if (nextWord.length() < 3) {
                wordsIterator.remove();
            }
        }
        //2
        Collections.sort(words);
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}

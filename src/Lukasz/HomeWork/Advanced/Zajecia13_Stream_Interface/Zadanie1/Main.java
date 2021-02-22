package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         Wczytujemy od użytkownika wzrost ludzi. Dzielimy je na grupy co 10 cm.
         Proszę w każdej grupie zapisać listę wszystkich wzrostów jakie wystąpiły w danej grupie,
         czyli np. grupa 150cm to wzrost 154 i 156.
         Proszę tu wykorzystać mechanizm, który utworzyliśmy dla miast i imion na zajęciach.
         Dla każdej z grup wyświetlcie wyniki.
         */

        Map<Integer, List<Integer>> peopleHeight = new TreeMap<>();

        for ( ; ; ) {

            System.out.println("Proszę podać wzrost w cm [0 - zakończenie programu]: ");
            int height = sc.nextInt();
            if (height == 0) {
                break;
            }
            int heightGroup = height - (height % 10);

            if (peopleHeight.containsKey(heightGroup)) {
                peopleHeight.get(heightGroup).add(height);
            }
            else {
                List<Integer> heightByGroup = new ArrayList<>();
                heightByGroup.add(height);
                peopleHeight.put(heightGroup, heightByGroup);
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : peopleHeight.entrySet()) {
            System.out.println("Grupa wzrostu " + "[" + entry.getKey() + "]: ");
            for (int h : entry.getValue()) {
                System.out.print(h + ", ");
            }
            System.out.println();
        }


    }
}

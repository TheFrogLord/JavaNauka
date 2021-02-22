package Lukasz.SDA_Advanced.zajecia12.Collections.Wlasne;

import java.util.ArrayList;
import java.util.List;

/*
6. Napisz funkcje, która połaczy dwie listy i usunie te,
ktore sie powtarzaja
1,2,3    i   3,4,5 -> 1,2,3,4,5
Nie używaj SET
 */
public class MainEx6 {

    public static void main(String[] args) {

        /*moje:
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();

        first.add(1);
        first.add(2);
        first.add(3);

        second.add(3);
        second.add(4);
        second.add(5);

        first.removeAll(second);
        first.addAll(second);

        for (Integer numbers : second) {
            System.out.println(second + ", ");
        }*/

        List<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        List<Integer> listB = new ArrayList<>();
        listB.add(3);
        listB.add(4);
        listB.add(5);
        List<Integer> withoutDuplicates = concatWithoutDuplicates(listA, listB);
        for (Integer number : withoutDuplicates) {
            System.out.print(number + ", ");
        }
    }

    private static <T> List<T> concatWithoutDuplicates(List<T> listA, List<T> listB) {
        listA.removeAll(listB);
        listA.addAll(listB);
        return listA;

    }
}

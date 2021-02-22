package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie1i2;

import java.util.Comparator;
import java.util.List;

public class SortedLists {

    //zadanie1
    public void returnList(List<String> list) {
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    //zadanie2
    public void returnListIgnoreCase(List<String> list) {
        list.sort(String::compareToIgnoreCase);
        for (String a : list) {
            System.out.print(a + ", ");
        }
    }
}

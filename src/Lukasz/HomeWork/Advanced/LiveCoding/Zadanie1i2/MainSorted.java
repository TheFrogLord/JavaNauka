package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie1i2;

import java.util.ArrayList;
import java.util.List;

public class MainSorted {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Moja");
        list.add("Twoja");
        list.add("Jego");
        list.add("zadanie pierwsze");
        list.add("analfabeta");

        SortedLists result = new SortedLists();
        result.returnList(list);
        System.out.println();
        result.returnListIgnoreCase(list);
    }
}

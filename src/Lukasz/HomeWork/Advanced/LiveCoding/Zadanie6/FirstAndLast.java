package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie6;

import java.util.Map;

public class FirstAndLast<T> {

    public void firstLast(Map<T, T> map) {
        Object[] first = map.entrySet().toArray();
        System.out.println(first[0] + ", " + first[first.length - 2]);
    }
}

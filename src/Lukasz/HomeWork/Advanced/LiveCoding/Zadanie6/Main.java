package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie6;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        FirstAndLast result = new FirstAndLast();

        Map<String, String> map = new TreeMap<>();

        map.put("Hej", "Ho");
        map.put("To", "Ja");
        map.put("Już", "Pójdę");
        map.put("Sobie", "Spać");

        result.firstLast(map);
    }
}

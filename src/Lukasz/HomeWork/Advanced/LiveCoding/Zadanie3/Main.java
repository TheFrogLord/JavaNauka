package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        DisplayMap result = new DisplayMap();

        map.put("Java", 11);
        map.put("PHP", 1);
        map.put("Interfaces", 120);
        map.put("Hibernate", 136);
        map.put("SQL", 250);

        result.mapDisplay(map);
    }
}

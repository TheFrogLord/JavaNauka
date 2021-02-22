package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie3;

import java.util.Map;

public class DisplayMap {

    public void mapDisplay(Map<String, Integer> map) {
        int last = (Integer) map.values().toArray()[map.size() - 1];

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() != last) {
                System.out.println("Klucz: " + entry.getKey()
                        + ", " + "Wartość: " + entry.getValue() + ", ");
            } else {
                System.out.println("Klucz: " + entry.getKey()
                        + ", " + "Wartość: " + entry.getValue() + ". ");
            }
        }
    }
}

package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie4;

import java.util.*;

public class Storage {

    private Map<String, List<String>> map;

    public Storage(Map<String, List<String>> map) {
        this.map = map;
    }

    public void addToStorage(String key, String... value) {
        map.put(key, Arrays.asList(value));
    }

    public void printValues(String key) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey().equals(key)) {
                System.out.println("Values for " + key + " key: ");
                System.out.print(entry.getValue() + ", ");
            }
        }
    }

    public void findValues(String value) {

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(value)) {
                System.out.println(entry.getKey());
            }
        }
    }
}

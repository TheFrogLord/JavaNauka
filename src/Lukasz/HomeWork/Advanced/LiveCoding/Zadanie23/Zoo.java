package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie23;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Zoo {

    private Map<String, Integer> animals = new HashMap<>();

    public Zoo() {
    }

    public int getNumberOfAllAnimals() {
        System.out.println("Number of all animals:");
        return animals.values().stream().reduce(0, Integer::sum);
    }

    public Map<String, Integer> getAnimalsCount() {
        System.out.println("Animals in zoo:");
        return animals;
    }

    public Map<String, Integer> getAnimalsCountSorted() {
        return animals.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }

    public void addAnimals(String name, int count) {
        animals.put(name, count);
    }
}

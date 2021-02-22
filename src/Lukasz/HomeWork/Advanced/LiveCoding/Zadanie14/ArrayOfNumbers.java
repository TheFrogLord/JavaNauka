package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie14;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayOfNumbers {

    private List<Integer> array;
    Random rn = new Random();

    public ArrayOfNumbers(List<Integer> array) {
        this.array = array;
    }

    public void uniqueElementsList() {
        array.stream().collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    public void doubledElementsList() {
        array.stream().filter(n -> Collections.frequency(array, n) > 1)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }

    public List<Integer> replaceDuplicates() {
        List<Integer> collect = array.stream().filter(n -> Collections.frequency(array, n) > 1)
                .filter(n -> Collections.replaceAll(array, n, rn.nextInt())).collect(Collectors.toList());
        return collect;
    }
}

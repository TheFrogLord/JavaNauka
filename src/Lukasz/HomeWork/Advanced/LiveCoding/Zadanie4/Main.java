package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie4;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Storage one = new Storage(new TreeMap<>());

        one.addToStorage("First", "X", "Y");
        one.addToStorage("Second", "11", "12");
        one.addToStorage("Third", "X", "12");
        one.addToStorage("Fourth", "LastOne");

        one.printValues("First");
        System.out.println();
        one.findValues("X");

    }
}

package Lukasz.HomeWork.Advanced.Generic.Zadanie4i5;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pairs1 = new Pair<>("Hej ho", 15);
        Pair<Character, String> pairs2 = new Pair<>('A', "Analog");

        System.out.println(pairs1.showDetails() + " / " + pairs2.showDetails());
        pairs1.swapElements();
        pairs2.swapElements();
    }
}

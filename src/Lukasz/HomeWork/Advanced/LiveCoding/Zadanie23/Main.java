package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie23;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        zoo.addAnimals("Tiger", 5);
        zoo.addAnimals("Monkey", 13);
        zoo.addAnimals("Elephant", 2);
        zoo.addAnimals("Polar Bear", 3);

        System.out.println(zoo.getNumberOfAllAnimals());
        System.out.println(zoo.getAnimalsCount());
        System.out.println(zoo.getAnimalsCountSorted());
    }
}

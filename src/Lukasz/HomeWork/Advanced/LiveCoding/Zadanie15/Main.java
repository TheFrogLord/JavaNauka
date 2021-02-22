package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie15;

public class Main {
    public static void main(String[] args) {

        System.out.println("Is regular?");
        System.out.println(Car.TOYOTA.isRegular());
        System.out.println("Is premium?");
        System.out.println(Car.TOYOTA.isPremium());

        System.out.println(Car.BMW.isFasterThan(Car.FERRARI));


    }
}

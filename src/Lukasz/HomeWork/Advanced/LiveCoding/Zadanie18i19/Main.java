package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie18i19;

public class Main {
    public static void main(String[] args) {
        Computer one = new Computer("Intel i5", 16, "GTX 3060", "Asus", "ROG");
        Computer two = new Computer("Ryzen 5", 8, "GTX 2080", "Lenovo", "Gladius");
        Computer three = new Computer("Intel i7", 32, "Radeon 6800XT", "HP", "Pavilion");
        Laptop first = new Laptop("Ryzen 3", 8, "GTX 940MX", "Toshiba", "XML", 5500);
        Laptop second = new Laptop("Ryzen 3", 8, "GTX 940MX", "Toshiba", "XML", 7500);

        System.out.println(one.equals(two));
        System.out.println(one.hashCode());
        System.out.println(one);
        System.out.println(first);
    }
}

package Lukasz.SDA_Advanced.zajecia10.Zadanie1;

public class Animal {

    private int numberOfLimbs;
    public String whatEats;
    protected String group;

    public Animal(int numberOfLimbs, String whatEats, String group) {
        this.numberOfLimbs = numberOfLimbs;
        this.whatEats = whatEats;
        this.group = group;
    }

    public void eat() {
        System.out.println("Animal eats " + whatEats);

    }

    public void move() {
        System.out.println("Animal move on: " + numberOfLimbs + " legs");

    }
}

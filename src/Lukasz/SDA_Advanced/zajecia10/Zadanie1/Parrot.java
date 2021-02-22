package Lukasz.SDA_Advanced.zajecia10.Zadanie1;

public class Parrot extends Animal {

    private String colour;
    private String species;

    public Parrot(int numberOfLimbs, String whatEats, String group, String color, String species) {
        super(numberOfLimbs, whatEats, group);
        this.colour = color;
        this.species = species;
    }

    public void saySomething() {
        System.out.println(species + " Kwa Kwa");
    }

    @Override
    public void eat() {
        System.out.println("Parrot is " + whatEats + " eater");
    }

    public void move() {
        System.out.println(colour + " " + group + " fly");
    }
}

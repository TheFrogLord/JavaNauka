package Lukasz.SDA_Advanced.zajecia10.Zadanie1;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal(4, "meat", "mammal");
        Parrot parrot = new Parrot(2, "grain", "parrots", "green", "bird" );

        animal.eat();
        parrot.eat();

        animal.move();
        parrot.move();
    }


}

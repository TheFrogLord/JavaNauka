package Lukasz.SDA_Advanced.zajecia11.KlasyWewnetrzne;

import static Lukasz.SDA_Advanced.zajecia11.KlasyWewnetrzne.Car.Engine;

public class Main {

    public static void main(String[] args) {
        //wewnetrzna klasa STATYCZNA
        Engine engine = new Engine("diesel", 180);
        Car car = new Car(engine, "Opel", "Insignia");
        car.showDetails();

        //wewnetrzna klasa NIESTATYTCZA
        Human human = new Human(25, 80);
        Human.Brain brain = human.new Brain(2);
        brain.showDetails();
    }

}

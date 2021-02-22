package Lukasz.SDA_Advanced.zajecia14.Serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String path = "/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/sda.bin";

        try (ObjectOutputStream stream =
                     new ObjectOutputStream(new FileOutputStream(path))) {
            Car car = new Car("Ford", "Focus", 2018);

            stream.writeObject(car);
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream stream =
                     new ObjectInputStream(new FileInputStream(path))) {

            Car car = (Car) stream.readObject();
            System.out.println(car.getProducer());
            System.out.println(car.getModel());
            System.out.println(car.getYearOfProduction());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

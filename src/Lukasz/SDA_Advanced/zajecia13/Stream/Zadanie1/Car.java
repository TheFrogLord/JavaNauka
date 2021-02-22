package Lukasz.SDA_Advanced.zajecia13.Stream.Zadanie1;

import java.util.List;

public class Car {

    private String producer;
    private String model;
    private int yearOfProduction;
    private int horsePower;
    private List<String> options;

    public Car(String producer, String model, int yearOfProduction, int horsePower, List<String> options) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.horsePower = horsePower;
        this.options = options;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public List<String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", horsePower=" + horsePower +
                ", options=" + options +
                '}';
    }
}

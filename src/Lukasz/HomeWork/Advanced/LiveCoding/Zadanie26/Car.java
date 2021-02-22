package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie26;

public class Car {
    public String name;
    public String description;
    public CarType carType;

    public Car(String name, String description, CarType carType) {
        this.name = name;
        this.description = description;
        this.carType = carType;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarType getCarType() {
        return carType;
    }

    @Override
    public String toString() {
        return "name: " + name + " | " +
                "description: " + description + " | " +
                "type: " + carType + " | " + "\n";
    }
}

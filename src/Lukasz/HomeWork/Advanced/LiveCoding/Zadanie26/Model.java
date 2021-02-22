package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie26;

import java.util.List;

public class Model {

    public String name;
    public int productionStartYear;
    List<Car> cars;

    public Model(String name, int productionStartYear, List<Car> cars) {
        this.name = name;
        this.productionStartYear = productionStartYear;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public int getProductionStartYear() {
        return productionStartYear;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                ", productionStartYear=" + productionStartYear +
                '}';
    }
}

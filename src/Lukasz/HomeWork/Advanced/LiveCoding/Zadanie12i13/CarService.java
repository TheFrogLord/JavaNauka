package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie12i13;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    private List<Car> carList = new ArrayList<>();

    public CarService() {
    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public void removeCar(Car car) {
        carList.remove(car);
    }

    public List<Car> showListOfCars() {
        return carList;
    }

    public List<Car> carsWithV12() {
        return carList.stream().filter(car -> EngineType.V12.equals(car.getEngineType()))
                .collect(Collectors.toList());
    }

    public List<Car> carsBefore1999(long year) {
        return carList.stream().filter(car -> car.getProductionYear() < year)
                .collect(Collectors.toList());
    }
}

package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie12i13;

import java.util.List;
import java.util.Objects;

public class Car {

    private String name;
    private String model;
    private double price;
    private long productionYear;
    private List<Manufacturer> manufacturerList;
    private EngineType engineType;

    public Car(String name, String model, double price, long productionYear, List<Manufacturer> manufacturerList, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
    }

    public void addManufacturer(Manufacturer manufacturer) {
        manufacturerList.add(manufacturer);
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public long getProductionYear() {
        return productionYear;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductionYear(long productionYear) {
        this.productionYear = productionYear;
    }

    public void setManufacturerList(List<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getPrice(), getPrice()) == 0
                && getProductionYear() == car.getProductionYear()
                && getName().equals(car.getName()) && getModel().equals(car.getModel())
                && getManufacturerList().equals(car.getManufacturerList())
                && getEngineType() == car.getEngineType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getModel(), getPrice(),
                getProductionYear(), getManufacturerList(), getEngineType());
    }

    @Override
    public String toString() {
        return "Car \n" +
                "name: " + name + '\n' +
                "model: " + model + '\n' +
                "price: " + price + "\n" +
                "productionYear: " + productionYear + "\n" +
                "manufacturerList: " + manufacturerList + "\n" +
                "engineType: " + engineType + "\n";
    }
}

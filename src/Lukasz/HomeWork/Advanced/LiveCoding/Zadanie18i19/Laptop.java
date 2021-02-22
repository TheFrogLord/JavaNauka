package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie18i19;

import java.util.Objects;

public class Laptop extends Computer{

    private long battery;

    public Laptop(String processor, int ram, String graphicCard, String company, String model, long battery) {
        super(processor, ram, graphicCard, company, model);
        this.battery = battery;
    }

    public long getBattery() {
        return battery;
    }

    public void setBattery(long battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "battery=" + battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return getBattery() == laptop.getBattery();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBattery());
    }
}

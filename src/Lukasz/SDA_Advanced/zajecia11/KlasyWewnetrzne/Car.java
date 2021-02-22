package Lukasz.SDA_Advanced.zajecia11.KlasyWewnetrzne;

public class Car {
    private Engine engine;
    private String manufacturer;
    private String model;

    public Car(Engine engine, String manufacturer, String model) {
        this.engine = engine;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void showDetails() {
        System.out.println(manufacturer + " " + model);
        System.out.println("Engine: " + engine.fuelType + ", " + engine.horsePower + "HP");
    }

    public static class Engine {
        private String fuelType;
        private int horsePower;

        public Engine(String fuelType, int horsePower) {
            this.fuelType = fuelType;
            this.horsePower = horsePower;
        }

        public String getFuelType() {
            return fuelType;
        }

        public int getHorsePower() {
            return horsePower;
        }
    }

}

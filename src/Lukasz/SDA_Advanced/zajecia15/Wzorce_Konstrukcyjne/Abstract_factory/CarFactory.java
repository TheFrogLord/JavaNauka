package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Abstract_factory;

public interface CarFactory {

    Engine getEngine();

    Chassis getChassis();

    Wheel getWheels();


}

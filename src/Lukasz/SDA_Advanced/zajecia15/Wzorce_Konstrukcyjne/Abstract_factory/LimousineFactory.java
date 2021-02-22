package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Abstract_factory;

public class LimousineFactory implements CarFactory{
    @Override
    public Engine getEngine() {
        return new PowerHorseEngine();
    }

    @Override
    public Chassis getChassis() {
        return new MetallicChassis();
    }

    @Override
    public Wheel getWheels() {
        return new TwentyInchGoldWheel();
    }
}

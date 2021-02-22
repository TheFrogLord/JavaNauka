package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Abstract_factory;

public class TwentyInchGoldWheel implements Wheel {

    @Override
    public Integer getWheelSize() {
        return 20;
    }

    @Override
    public Double getWeight() {
        return 25.5;
    }

    @Override
    public Double getPrice() {
        return 800.45;
    }
}

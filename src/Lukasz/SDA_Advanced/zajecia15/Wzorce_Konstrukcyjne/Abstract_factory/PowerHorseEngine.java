package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Abstract_factory;

public class PowerHorseEngine implements Engine{

    @Override
    public Integer getHorsePower() {
        return 230;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public Double getPrice() {
        return 34000.00;
    }
}

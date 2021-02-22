package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Abstract_factory;

public class MetallicChassis implements Chassis{
    @Override
    public String getLacquer() {
        return "Metallic";
    }

    @Override
    public String getType() {
        return "Sedan";
    }

    @Override
    public Double getPrice() {
        return 25000.2;
    }
}

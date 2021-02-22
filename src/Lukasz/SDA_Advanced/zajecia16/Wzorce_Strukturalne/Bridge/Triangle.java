package Lukasz.SDA_Advanced.zajecia16.Wzorce_Strukturalne.Bridge;

public class Triangle extends Shape{


    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String getColoredShape() {
        return getColor() + " triangle";
    }
}

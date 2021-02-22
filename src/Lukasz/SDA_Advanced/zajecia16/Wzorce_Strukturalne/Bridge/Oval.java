package Lukasz.SDA_Advanced.zajecia16.Wzorce_Strukturalne.Bridge;

public class Oval extends Shape {

    public Oval(Color color) {
        super(color);
    }

    @Override
    public String getColoredShape() {
        return getColor() + " oval";
    }

}

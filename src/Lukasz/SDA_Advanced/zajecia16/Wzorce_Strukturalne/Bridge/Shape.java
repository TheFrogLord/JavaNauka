package Lukasz.SDA_Advanced.zajecia16.Wzorce_Strukturalne.Bridge;

public abstract class Shape implements Color {

    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract String getColoredShape();

    @Override
    public String getColor() {
        return color.getColor();
    }

}

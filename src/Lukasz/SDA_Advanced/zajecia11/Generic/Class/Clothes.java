package Lukasz.SDA_Advanced.zajecia11.Generic.Class;

public class Clothes implements Item {
    private String type;
    private String color;

    public Clothes(String type, String color) {
        this.type = type;
        this.color = color;
    }

    @Override
    public String getDetails() {
        return color + " " + type;
    }
}
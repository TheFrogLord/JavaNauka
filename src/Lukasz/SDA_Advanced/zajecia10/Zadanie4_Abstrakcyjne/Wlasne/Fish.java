package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Abstrakcyjne.Wlasne;

public abstract class Fish implements Animal{

    private String colour;

    public Fish(String colour) {
        this.colour = colour;
    }

    @Override
    public void move() {
        System.out.println("Swimming in water.");

    }

    public abstract String whereLive();
}

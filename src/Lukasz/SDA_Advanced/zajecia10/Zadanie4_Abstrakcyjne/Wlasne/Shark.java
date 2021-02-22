package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Abstrakcyjne.Wlasne;

public class Shark extends Fish {
    private String type;


    public Shark(String colour, String type) {
        super(colour);
        this.type = type;

    }

    @Override
    public void eat() {
        System.out.println("Eating people.");

    }

    @Override
    public String whereLive() {
        return "Shark live in the ocean.";

    }
}

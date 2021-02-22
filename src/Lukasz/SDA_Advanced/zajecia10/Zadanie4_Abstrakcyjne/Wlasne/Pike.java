package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Abstrakcyjne.Wlasne;

public class Pike extends Fish{

    private double length;
    private double weight;
    private String colour;

    public Pike(String colour, double length, double weight) {
        super(colour);
        this.length = length;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Eating smaller fish.");

    }

    public String whereLive() {
        return "Pike live in rivers.";

    }
}

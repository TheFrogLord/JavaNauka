package Lukasz.SDA_Advanced.zajecia11.Generic.Class;

public class ClothesBox extends Box<Clothes> {

    private String owner;

    public ClothesBox(String owner, Clothes... content) {
        super(content);
        this.owner = owner;
    }

    public void displayOwner() {
        System.out.println(owner);
    }
}
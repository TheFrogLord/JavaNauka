package Lukasz.HomeWork.Advanced.Zajecia15_Wzorce.Zadanie2;

public class MapleTree implements Tree {

    private double height;
    private double width;
    private LeavesColor leavesColor;
    private FruitType fruits;

//Tworzę konstruktor bazowy
    public MapleTree(double height, double width, LeavesColor leavesColor, FruitType fruits) {
        this.height = height;
        this.width = width;
        this.leavesColor = leavesColor;
        this.fruits = fruits;
    }
//Tworzę pywatny konstruktor jako kopię do klonowania
    private MapleTree(MapleTree mapleTree) {
        this.height = mapleTree.height;
        this.width = mapleTree.width;
        this.leavesColor = mapleTree.leavesColor;
        this.fruits = mapleTree.fruits;
    }

    @Override
//Klonuję bazowy konstruktor za pomocą prywatnego
    public Tree clone() {
        return new MapleTree(this);
    }

    @Override
    public Tree setHeight(double height) {
        this.height = height;
        return this;
    }

    @Override
    public Tree setWidth(double width) {
        this.width = width;
        return this;
    }

    @Override
    public String toString() {
        return "height: " + height + ", " +
               "width: " + width + ", " +
               "leavesColor: " + leavesColor + ", " +
               "fruits: " + fruits;
    }
}

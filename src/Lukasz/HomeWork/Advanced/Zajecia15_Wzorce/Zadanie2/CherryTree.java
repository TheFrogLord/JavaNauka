package Lukasz.HomeWork.Advanced.Zajecia15_Wzorce.Zadanie2;

public class CherryTree implements Tree{

    private double height;
    private double width;
    private LeavesColor leavesColor;
    private FruitType fruits;

    public CherryTree(double height, double width, LeavesColor leavesColor, FruitType fruits) {
        this.height = height;
        this.width = width;
        this.leavesColor = leavesColor;
        this.fruits = fruits;
    }

    private CherryTree(CherryTree cherryTree) {
        this.height = cherryTree.height;
        this.width = cherryTree.width;
        this.leavesColor = cherryTree.leavesColor;
        this.fruits = cherryTree.fruits;
    }

    @Override
    public Tree clone() {
        return new CherryTree(this);
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

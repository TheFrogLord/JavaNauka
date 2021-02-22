package Lukasz.SDA_Advanced.zajecia16.Wzorce_Strukturalne.Decorator;

public abstract class TreeDecorator implements Tree {

    private ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String showChristmasTree() {
        return christmasTree.showChristmasTree();
    }
}

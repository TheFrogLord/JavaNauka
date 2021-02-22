package Lukasz.SDA_Advanced.zajecia16.Wzorce_Strukturalne.Decorator;

public class MainDecorator {

    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTree();
        System.out.println(christmasTree.showChristmasTree());

        Tree treeWithLights = new LightDecorator(christmasTree);
        System.out.println(treeWithLights.showChristmasTree());

        //Tree withSweets = new SweetsDecorator(treeWithLights);
        //System.out.println(withSweets.showChristmasTree());
    }
}

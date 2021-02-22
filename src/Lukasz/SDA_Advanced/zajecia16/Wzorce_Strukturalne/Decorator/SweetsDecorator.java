package Lukasz.SDA_Advanced.zajecia16.Wzorce_Strukturalne.Decorator;

public class SweetsDecorator extends TreeDecorator {

    public SweetsDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String showChristmasTree() {
        return super.showChristmasTree() + " and sweets";
    }
}

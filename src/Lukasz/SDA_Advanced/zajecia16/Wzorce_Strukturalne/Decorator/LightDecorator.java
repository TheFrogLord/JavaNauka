package Lukasz.SDA_Advanced.zajecia16.Wzorce_Strukturalne.Decorator;

public class LightDecorator extends TreeDecorator {

    public LightDecorator(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String showChristmasTree() {
        return super.showChristmasTree() + " beautiful colorful lights";
    }

}

package Lukasz.SDA_Advanced.zajecia16.Wzorce_Strukturalne.Bridge;

public class Client {
    public static void main(String[] args) {

        Shape blueOval = new Oval(new BlueColor());
        System.out.println(blueOval.getColoredShape());

        Shape redOval = new Oval(new RedColor());
        System.out.println(redOval.getColoredShape());

        Shape redTriangle = new Triangle(new RedColor());
        System.out.println(redTriangle.getColoredShape());

    }
}

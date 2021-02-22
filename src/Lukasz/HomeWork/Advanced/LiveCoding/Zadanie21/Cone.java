package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie21;

public class Cone extends Shape3D {

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return (Math.PI * Math.pow(radius, 2)) / 3;
    }

    @Override
    public String fill(int liquid) {
        System.out.println("Nalano " + liquid + " cm3 płynu");
        if (liquid > calculateVolume()) {
            return "Ups, przelałeś";
        }
        else if (liquid == calculateVolume()) {
            return "Super, nalałeś po brzegi";
        }
        else {
            return "Hmm, naczynie nie wypełnione";
        }
    }
}

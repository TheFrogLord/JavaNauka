package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie21;

public class Qube extends Shape3D {

    private double a;

    public Qube(double a) {
        this.a = a;
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
        return a * a * a;
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

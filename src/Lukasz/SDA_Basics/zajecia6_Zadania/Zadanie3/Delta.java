package Lukasz.SDA_Basics.zajecia6_Zadania.Zadanie3;

public class Delta {


    public int delta(int a, int b, int c) {

        int delta = (int) Math.pow(b, 2) - (4 * a * c);
        return delta;
    }

    public double argx1(double delta, int a, int b) {

        double x1 = (-b - Math.sqrt(delta)) / 2 * a;
        return x1;
    }

    public double argx2(double delta, int a, int b) {

        double x2 = (-b + Math.sqrt(delta)) / 2 * a;
        return x2;
    }

    public void result(int a, int b, int c) {

        double delta = delta(a, b, c);
        if (delta(a, b, c) > 0) {
            System.out.println("Argument x1 = " + argx1(delta, a, b));
            System.out.println("Argument x2 = " + argx2(delta, a, b));

        } else {
            System.out.println("Delta ujemna");
        }
    }
}


package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie21;

public class Main {
    public static void main(String[] args) {
        Cone cone = new Cone(4.5, 8.5);
        Qube qube = new Qube(3);

        /*System.out.printf("%.2f %s", cone.calculateVolume(), "\n");
        System.out.printf("%.2f %s", qube.calculateVolume(), "\n");*/

        System.out.println(qube.fill(27));
    }
}

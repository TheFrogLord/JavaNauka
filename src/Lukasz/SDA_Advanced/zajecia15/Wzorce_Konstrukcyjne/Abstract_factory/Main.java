package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Abstract_factory;

public class Main {
    public static void main(String[] args) {

        CarFactory sedan = new LimousineFactory();
        double totalPrice = sedan.getChassis().getPrice() + sedan.getWheels().getPrice() + sedan.getEngine().getPrice();

        System.out.println("Sedan: \n" + "Chassis - " + sedan.getChassis().getType() + "\n"
                            + "Lacquer type - " + sedan.getChassis().getLacquer() + "\n"
                            + "Engine power - " + sedan.getEngine().getHorsePower() + "\n"
                            + "Wheels size - " + sedan.getWheels().getWheelSize() + " inch\n"
                            + "Total price - " + totalPrice +  " dolars.");

    }
}

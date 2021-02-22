package Lukasz.SDA_Advanced.zajecia15.Wzorce_Konstrukcyjne.Factory.Excample;

public class Main {

    public static void main(String[] args) {

        String pizza = new PizzaReceiptFactory().getPizza(PizzaTypeEnum.HAWAI, Thickness.CIENKIE).getReceipt();
        String anotherPizza = new PizzaReceiptFactory().getPizza(PizzaTypeEnum.HAWAI, Thickness.CIENKIE).getReceipt();
        String newPizza = new PizzaReceiptFactory().getPizza(PizzaTypeEnum.HAWAI, Thickness.RAZOWE).getReceipt();

        System.out.println("First pizza: \n" + pizza +"\n" + "\nSecond Pizza: \n" + anotherPizza + "\n");
        System.out.println("Extra order: " + "\n" + newPizza);
    }
}

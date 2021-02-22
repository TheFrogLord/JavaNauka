package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie24i25;

public class Basket {
    private int counter;

    public Basket(int counter) {
        this.counter = counter;
    }

    public void addToBasket() {
        counter++;
        try {
            if (counter > 10) {
                System.out.println("BasketFullException");
            }
        } catch (RuntimeException ex) {
            System.out.println("BasketFullException");
        }
        System.out.println("Element was added to the basket");
    }

    public void removeFromBasket() {
        counter--;
        try {
            if (counter < 0) {
                System.out.println("BasketEmptyException");
            }
        } catch (RuntimeException ex) {
            System.out.println("BasketEmptyException");
        }
        System.out.println("Element was removed from basket");
    }
}

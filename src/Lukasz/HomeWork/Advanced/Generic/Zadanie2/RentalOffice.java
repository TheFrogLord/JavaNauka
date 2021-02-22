package Lukasz.HomeWork.Advanced.Generic.Zadanie2;

public class RentalOffice<T extends Items> {

    private T[] item;

    //Items are books, discs and movies
    public RentalOffice(T... item) {
        this.item = item;
    }

    //Display items in the shop
    public void displayItems() {
        for (T items : item) {
            System.out.println(items.getDescription());
        }
    }

    //Method that replace status by index of array (enum)
    public void refreshStatus(int newNumber, int index) {
        ItemStatus[] status = ItemStatus.values();
        for (T items : item) {
            if (items.getNumber() == newNumber) {
                items.updateStatus(status[index - 1]);
            }
            System.out.println(items.getDescription());
        }
    }
}


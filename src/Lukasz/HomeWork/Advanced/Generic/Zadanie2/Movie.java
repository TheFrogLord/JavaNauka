package Lukasz.HomeWork.Advanced.Generic.Zadanie2;

public class Movie implements Items {

    private int number;
    private String title;
    private String statusName;

    public Movie(int number, String title) {
        this.number = number;
        this.title = title;
        this.statusName = ItemStatus.BORROW.getStatusName();//start with status borrow
    }

    @Override
    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return "\t" + number + ". " + title + ": " + "status -> " + statusName;
    }

    public void updateStatus(ItemStatus newStatus) {
        this.statusName = newStatus.getStatusName();
    }

}

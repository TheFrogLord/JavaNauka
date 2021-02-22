package Lukasz.HomeWork.Advanced.Generic.Zadanie2;

public class Book implements Items {

    private int number;
    private String authorName;
    private String title;
    private String statusName;

    public Book(int number, String authorName, String title) {
        this.number = number;
        this.authorName = authorName;
        this.title = title;
        this.statusName = ItemStatus.BORROW.getStatusName(); //start with status borrow
    }

    @Override
    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return "\t" + number + ". " + authorName + ", " + title + ": " + "status -> " + statusName;
    }

    public void updateStatus(ItemStatus newStatus) {
        this.statusName = newStatus.getStatusName();
    }
}


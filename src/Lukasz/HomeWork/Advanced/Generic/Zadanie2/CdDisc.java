package Lukasz.HomeWork.Advanced.Generic.Zadanie2;

public class CdDisc implements Items {

    private int number;
    private String artist;
    private String title;
    private String statusName;

    public CdDisc(int number, String artist, String title) {
        this.number = number;
        this.artist = artist;
        this.title = title;
        this.statusName = ItemStatus.BORROW.getStatusName();//start with status borrow
    }

    @Override
    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return "\t" + number + ". " + artist + ", " + title + ": " + "status -> " + statusName;
    }

    public void updateStatus(ItemStatus newStatus) {
        this.statusName = newStatus.getStatusName();
    }
}

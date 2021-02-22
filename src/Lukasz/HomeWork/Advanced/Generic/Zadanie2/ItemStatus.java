package Lukasz.HomeWork.Advanced.Generic.Zadanie2;

public enum ItemStatus {

    BORROW("Borrow"),
    RETURN("To be returned"),
    BLOCKED("Blocked");

    private String statusName;

    ItemStatus(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }

    public static void showList() {
        ItemStatus[] status = ItemStatus.values();
        int index = 1;
        for (ItemStatus values : status) {
            System.out.println(index++ + ". " + values.getStatusName());
        }
    }
}

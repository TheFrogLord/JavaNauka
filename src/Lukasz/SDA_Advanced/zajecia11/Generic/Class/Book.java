package Lukasz.SDA_Advanced.zajecia11.Generic.Class;

public class Book implements Item {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String getDetails() {
        return title + ", " + author;
    }
}
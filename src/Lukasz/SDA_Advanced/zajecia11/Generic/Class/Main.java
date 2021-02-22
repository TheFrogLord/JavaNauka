package Lukasz.SDA_Advanced.zajecia11.Generic.Class;

public class Main {

    public static void main(String[] args) {

        Box<Book> bookBox = new Box<>(
                new Book("J.K.Rowling", "Harry Potter"),
                new Book("H. Sienkiewicz", "Ogniem i mieczem"));
        bookBox.showContent();

        ClothesBox clothesBox = new ClothesBox(
                "Tomek", new Clothes("hat", "red")
        );
        clothesBox.showContent();

        /* Box<String> stringBox = new Box<>("Ala", "ma", "kota");
        stringBox.showContent();
        stringBox.changeContent(1, "nie ma");
        stringBox.showContent();
        //pudelko na obiekty
        Box<LocalDate> dateBox = new Box<>(LocalDate.now(),
                LocalDate.parse("2020-12-11"), LocalDate.parse("2019-12-11"));
        dateBox.showContent();
        dateBox.changeContent(0, LocalDate.parse("2012-05-12"));
        dateBox.showContent();
*/

    }
}

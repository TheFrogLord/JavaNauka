package Lukasz.HomeWork.Advanced.Generic.Zadanie2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        RentalOffice<Book> books = new RentalOffice<>(
                new Book(1, "Joe Hill", "Heart-Shaped Box"),
                new Book(2, "Steven Hall", "Devourer of thoughts"),
                new Book(3, "George R.R. Martin", "Fever Dream"));

        RentalOffice<CdDisc> disc = new RentalOffice<>(
                new CdDisc(4, "Dream Theater", "Awake"),
                new CdDisc(5, "Sepultura", "Roots"),
                new CdDisc(6, "Mandaryna", "Kij go wie"));

        RentalOffice<Movie> movie = new RentalOffice<>(
                new Movie(7, "Lost Boys"),
                new Movie(8, "Braveheart"),
                new Movie(9, "Silence of the lambs"));

        System.out.println("Status menu: ");
        ItemStatus.showList();

        System.out.println("Books: ");
        books.displayItems();

        System.out.println("Music: ");
        disc.displayItems();

        System.out.println("Movies: ");
        movie.displayItems();

        while (true) {
            System.out.println("Proszę wybrać nr pozycji: ");
            int number = sc.nextInt();
            System.out.println("Proszę podać nowy status: ");
            int index = sc.nextInt();

            System.out.println("Books: ");
            books.refreshStatus(number, index);

            System.out.println("Music: ");
            disc.refreshStatus(number, index);

            System.out.println("Movies: ");
            movie.refreshStatus(number, index);

            System.out.println("Continue? [Y/N]: ");
            char onOff = sc.next().charAt(0);
            if (onOff == 'N') {
                return;
            }
        }
    }
}

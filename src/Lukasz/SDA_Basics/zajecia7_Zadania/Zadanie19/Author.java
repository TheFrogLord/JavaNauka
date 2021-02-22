package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie19;

public class Author {

    private final String surname;
    private final String nationality;

    // Stworzenie Konstruktora Author
    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    /* W razie potrzeby można skorzystać z metod get i set.
        public String getSurname() {
            return this.surname;
        }

        public String getNationality() {
            return this.nationality;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }
     */

    //Metoda wywołująca nazwisko(ewentualnie narodowaość) autora
    public void showAuthor() {
        System.out.println("Autorem najobszerniejszego poematu jest:");
        System.out.print("Autor: " + surname + "\nKraj: " + nationality);
    }
}

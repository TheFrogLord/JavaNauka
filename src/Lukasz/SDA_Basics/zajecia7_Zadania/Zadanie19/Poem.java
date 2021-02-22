package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie19;

public class Poem {

    private final Author creator;
    private final int stropheNumbers;

    // Stworzenie konstruktora Poem
    public Poem(Author creator, int stropheNumbers) {
        this.creator = creator;
        this.stropheNumbers = stropheNumbers;
    }

    public int getStropheNumbers() {
        return this.stropheNumbers;
    }

    public Author getCreator() {
        return this.creator;
    }
}


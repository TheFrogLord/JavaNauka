package Lukasz.SDA_Basics.zajecia7_Zadania.Zadanie19;

public class Main {

    public static void main(String[] args) {

        /*Nowe obiekty klasy Author. Do przypisywania wartości można użyć metody
        set z klasy Author.
         */

        Author firstAuthor = new Author("Kowalski", "Nigeria");
        Author secondAuthor = new Author("Gioza", "Japan");
        Author thirdAuthor = new Author("Farfocel", "USA");

        //Stworzenie i zapisanie obiektów Poem w tablicy.

        Poem[] array = new Poem[3];
        array[0] = new Poem(firstAuthor, 2);
        array[1] = new Poem(secondAuthor, 14);
        array[2] = new Poem(thirdAuthor, 5);

        Main result = new Main();
        result.compare(array);
    }

    //Metoda wyświetlania autora (sprawdzanie indeksów tablicy)
    public void compare(Poem[] array) {

        Poem max = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1].getStropheNumbers() >= max.getStropheNumbers()) {
                max = array[i + 1];
            }
        }
        max.getCreator().showAuthor();
    }
}







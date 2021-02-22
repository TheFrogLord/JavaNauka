package Lukasz.SDA_Advanced.zajecia11.Exceptions_Wyjatki;

public class FileNotExistException extends Exception {

    public FileNotExistException() {
        super("Plik nie istnieje!");
    }
}

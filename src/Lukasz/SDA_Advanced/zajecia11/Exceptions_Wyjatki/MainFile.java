package Lukasz.SDA_Advanced.zajecia11.Exceptions_Wyjatki;

public class MainFile {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        try {
            System.out.println(fileReader.readTextFile("C:\\Users\\Tomasz.Rutyna\\Documents\\sda2.txt"));
        } catch (FileNotExistException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
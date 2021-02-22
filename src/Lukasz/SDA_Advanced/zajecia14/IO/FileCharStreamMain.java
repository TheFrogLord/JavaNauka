package Lukasz.SDA_Advanced.zajecia14.IO;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharStreamMain {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/in.txt");
            out = new FileWriter("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/out.txt");
            int nextChar;
            System.out.println("Odczyt pliku");
            while ((nextChar = in.read()) != -1) {
                System.out.print((char) nextChar);
                out.write(nextChar);
            }
            out.write("\nDodatkowy tekst do dopisania w formie Stringa");
            System.out.println("\nKoniec odczytu i zapisu do pliku");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

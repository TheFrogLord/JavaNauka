package Lukasz.SDA_Advanced.zajecia14.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamMain {
    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/in.txt");
            out = new FileOutputStream("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/out.txt");
            int byteData;
            System.out.println("Odczyt pliku");
            while ((byteData = in.read()) != -1) {
                System.out.print(byteData);
                out.write(byteData);
            }
            String additionalContent = "Dodatkowa zawartosc";
            byte[] bytes = additionalContent.getBytes();
            out.write(bytes);
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


package Lukasz.SDA_Advanced.zajecia14.IO;

import java.io.*;

public class FileBufferedCharStreamMain {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        try {
            in = new BufferedReader(new FileReader("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/in.txt"));
            out = new BufferedWriter(new FileWriter("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/out.txt"));
            in.lines()
                    .forEach(System.out::println);
            /*//Jezeli chce zapisac do pliku out, to uzywam ponizszego kodu
            String line;
            System.out.println("Odczyt pliku");
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                out.write(line + "\n");
            }*/
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

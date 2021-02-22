package Lukasz.SDA_Advanced.zajecia14.NewIO;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFileMain {
    public static void main(String[] args) {
        Path fileToWrite = Paths.get("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/out.txt");

        //Files.newBufferedWriter - jako drugi param mozemy dodac kodowanie pliku
        try (BufferedWriter writer = Files.newBufferedWriter(fileToWrite, StandardOpenOption.TRUNCATE_EXISTING)) {
            writer.write("Pierwsza linijka w pliku" + System.lineSeparator());
            //writer.newLine();
            writer.write("Druga linijka w pliku" + System.lineSeparator());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

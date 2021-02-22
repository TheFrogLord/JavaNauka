package Lukasz.SDA_Advanced.zajecia14.NewIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileMain {
    public static void main(String[] args) {
        Path fileToRead = Paths.get("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/in.txt");

        try (BufferedReader read = Files.newBufferedReader(fileToRead)) {
            read.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

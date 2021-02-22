package Lukasz.SDA_Advanced.zajecia14.NewIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileOperationMain {
    public static void main(String[] args) {

        Path  inFilePath = Paths.get("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/in.txt");
        Path directoryPath = Paths.get("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14");
        Path newDirectoryPath = Paths.get("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/new_dir");

        Paths.get("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/new_dir");
        Path copiedFilePath = Paths.get("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/copy_in.txt");
        //Files.delete(copiedFilePath);
        //Files.move(copiedFilePath, inFilePath);
        if (Files.isDirectory(directoryPath)) {
            File[] files = new File(directoryPath.toUri()).listFiles();
            for (File file: files) {
                System.out.println(file.getName());
            }
            try {
                Files.createDirectory(newDirectoryPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

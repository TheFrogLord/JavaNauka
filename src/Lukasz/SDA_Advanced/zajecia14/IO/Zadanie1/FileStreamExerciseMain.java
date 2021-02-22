package Lukasz.SDA_Advanced.zajecia14.IO.Zadanie1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileStreamExerciseMain {

    public static void main(String[] args) {

        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/in.txt");
            out = new FileWriter("/home/lukaszkedzierski/Łukasz/Programowanie/SDA/Pliki i slajdy/Zajęcia14/out.txt");
            int nextChar;
            System.out.println("Odczyt pliku");
            StringBuilder fileContent = new StringBuilder();
            while ((nextChar = in.read()) != -1) {
                fileContent.append((char) nextChar);
            }
            List<Integer> numbersList =
                    Arrays.stream(fileContent.toString().split(","))
                            .map(Integer::parseInt)
                            .filter(nbr -> nbr % 3 == 0)
                            .collect(Collectors.toList());
            for (Integer number: numbersList) {
                out.write(number + ",");
            }
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

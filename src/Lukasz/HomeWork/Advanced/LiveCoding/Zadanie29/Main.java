package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie29;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {


        Path filePath = Paths.get("C:\\2. Łukasz\\2. Programowanie\\1. SDA Academy\\Pliki i slajdy\\PracaDomowa\\PlikiTestowe\\Zadanie29.txt");

        String file = String.valueOf(filePath.getFileName());
        char[] out = file.toCharArray();
        StringBuilder sbOut = new StringBuilder();
        for (char c : out) {
            if (c != '.') {
                sbOut.append(c);
            } else {
                break;
            }
        }


        FileWriter output = new FileWriter("C:\\2. Łukasz\\2. Programowanie\\1. SDA Academy\\Pliki i slajdy\\PracaDomowa\\PlikiTestowe\\" + sbOut.reverse() + ".txt");
        BufferedReader reader = Files.newBufferedReader(filePath);

        int chars;
        StringBuilder sbIn = new StringBuilder();

        while ((chars = reader.read()) != -1) {
            sbIn.append((char) chars);
        }
        String textOut = String.valueOf(sbIn.reverse());
        System.out.println(textOut);
        output.append(sbIn.reverse());


    }
}

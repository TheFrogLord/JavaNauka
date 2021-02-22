package Lukasz.SDA_Advanced.zajecia11.Exceptions_Wyjatki;

import java.io.File;

public class FileReader {

    public String readTextFile(String file) throws FileNotExistException {
        if (new File(file).exists()) {
            return "dummyText";
        } else {
            throw new FileNotExistException();
        }
    }
}
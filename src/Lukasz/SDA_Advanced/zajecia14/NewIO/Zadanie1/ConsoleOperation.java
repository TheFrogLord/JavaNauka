package Lukasz.SDA_Advanced.zajecia14.NewIO.Zadanie1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConsoleOperation {
    private String actualPath;

    public ConsoleOperation(String actualPath) {
        this.actualPath = actualPath;
    }

    public void runCommand(String command) {
        String[] commandPart = command.split(" ");
        switch (commandPart[0]) {
            case "cd":
                cdCommand(commandPart[1]);
                break;
            case "mkdir":
                mkDir(commandPart[1]);
                break;
            case "pwd":
                pwdCommand();
                break;
            case "ls":
                lsCommand();
                break;
            default:
                System.out.println("Nieznana komenda");
        }
    }

    private void pwdCommand() {
        System.out.println(actualPath);
    }

    private void mkDir(String catalogue) {
        String newPath = actualPath + "\\" + catalogue;
        try {
            Files.createDirectory(Paths.get(newPath));
        } catch (IOException e) {
            System.out.println("Wystapil blad " + e.getMessage());
        }
    }

    private void cdCommand(String catalogue) {
        if ("..".equals(catalogue)) {
            int lastIndexOfSlash = actualPath.lastIndexOf("\\");
            if (lastIndexOfSlash == -1) {
                System.out.println("Nie mozemy sie cofnac");
            } else {
                actualPath = actualPath.substring(0, lastIndexOfSlash);
            }
        } else {
            String newPath = actualPath + "\\" + catalogue;
            File path = new File(newPath);
            if (path.exists() && path.isDirectory()) {
                actualPath = newPath;
            } else {
                System.out.println("Sciezka nie istnieje lub nie jest katalogiem");
            }
        }
    }

    private void lsCommand() {
        File actualPathFile = new File(actualPath);
        if (actualPathFile.isDirectory()) {
            for (File fileInPath: actualPathFile.listFiles()) {
                System.out.println(fileInPath.getName());
            }
        } else {
            System.out.println("Ta sciezka nie jest katalogiem");
        }
    }
}

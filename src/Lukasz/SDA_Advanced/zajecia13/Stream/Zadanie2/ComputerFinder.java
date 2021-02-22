package Lukasz.SDA_Advanced.zajecia13.Stream.Zadanie2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputerFinder {

    private List<Computer> computers = new ArrayList<>();

    public ComputerFinder() {
        computers.add(new Computer("MSI", 8, 1024, "Intel",
                Arrays.asList("Windows", "Office")));
        computers.add(new Computer("ASUS", 6, 2048, "AMD",
                Arrays.asList("Linux", "IntelliJ")));
        computers.add(new Computer("ASUS", 2, 512, "Intel",
                Arrays.asList()));
        computers.add(new Computer("Sony", 4, 128, "AMD",
                Arrays.asList("Windows")));
        computers.add(new Computer("Apple", 4, 512, "Intel",
                Arrays.asList("MacOSX")));
    }
    public List<Computer> findAll() {
        return computers;
    }


}

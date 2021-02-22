package Lukasz.SDA_Advanced.zajecia14.NewIO.Zadanie3;

import Lukasz.SDA_Advanced.zajecia14.NewIO.Zadanie2.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RankCreator {
    private static final String RESULTS_FILE = "C:\\Users\\Tomasz.Rutyna\\Desktop\\sda_files\\wyniki.txt";
    private static final String RANK_FILE = "C:\\Users\\Tomasz.Rutyna\\Desktop\\sda_files\\ranking.txt";

    public void create() {
        List<Candidate> candidates = getCandidates();

        saveRank(candidates);
    }

    private void saveRank(List<Candidate> candidates) {
        Path path = Paths.get(RANK_FILE);
        candidates.sort(Comparator.comparingDouble(Candidate::getAverageExamResult).reversed());
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            int rankPlace = 1;
            for (Candidate candidate : candidates) {
                writer.write(String.format("%d. %s %s - %f %s",
                        rankPlace++, candidate.getFirstName(), candidate.getLastName(),
                        candidate.getAverageExamResult(), System.lineSeparator()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<Candidate> getCandidates() {
        Path filePath = Paths.get(RESULTS_FILE);
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            return reader.lines()
                    .map(line -> line.split(","))
                    .map(fields -> new Candidate(fields[0], fields[1], fields[2], fields[3]))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}

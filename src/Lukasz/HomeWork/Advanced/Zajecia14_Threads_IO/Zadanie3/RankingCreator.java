package Lukasz.HomeWork.Advanced.Zajecia14_Threads_IO.Zadanie3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RankingCreator {

    private static final String STANDINGS_FILE = "C:\\2. Łukasz\\2. Programowanie\\1. SDA Academy\\Pliki i slajdy\\PracaDomowa\\PlikiTestowe\\druzyny.txt";
    private static final String SCORES_FILE = "C:\\2. Łukasz\\2. Programowanie\\1. SDA Academy\\Pliki i slajdy\\PracaDomowa\\PlikiTestowe\\bilansBramek.txt";
    private static final String POINTS_FILE = "C:\\2. Łukasz\\2. Programowanie\\1. SDA Academy\\Pliki i slajdy\\PracaDomowa\\PlikiTestowe\\bilansPunktow.txt";
    private static final String NAMES_FILE = "C:\\2. Łukasz\\2. Programowanie\\1. SDA Academy\\Pliki i slajdy\\PracaDomowa\\PlikiTestowe\\alfabetycznie.txt";

    //3.1. Metoda tworząca posortowaną listę wg punktów
    public void createPointsBilans() {
        List<Team> teamList = getTeams();
        savePointsBilans(teamList);
    }

    //3.2. Metoda tworząca posortowaną listę drużyn
    public void createScoreBilans() {
        List<Team> teamList = getTeams();
        saveScoreBilans(teamList);
    }

    //3.3. Metoda tworząca posortowaną alfabetycznie listę drużyn
    public void createNameBilans() {
        List<Team> teamList = getTeams();
        saveNameBilans(teamList);
    }

    private List<Team> getTeams() {
        Path filePath = Paths.get(STANDINGS_FILE);
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            return reader.lines()
                    .map(line -> line.split(","))
                    .map(fields -> new Team(fields[0], fields[1], fields[2], fields[3]))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    private void saveScoreBilans(List<Team> teamsList) {
        Path path = Paths.get(SCORES_FILE);
        teamsList.sort(Comparator.comparingInt(Team::getScoreBilans).reversed());
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            int rankPlace = 1;
            for (Team team : teamsList) {
                writer.write(String.format("%d. %s: %d\n",
                        rankPlace++, team.getTeamName(),
                        team.getScoreBilans()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void savePointsBilans(List<Team> teamList) {
        Path path = Paths.get(POINTS_FILE);
        teamList.sort(Comparator.comparingInt(Team::getPointSummary).reversed());
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            int rankPlace = 1;
            for (Team team : teamList) {
                writer.write(String.format("%d. %s: %d pkt\n",
                        rankPlace++, team.getTeamName(),
                        team.getPointSummary()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveNameBilans(List<Team> teamList) {
        Path path = Paths.get(NAMES_FILE);
        teamList.sort(Comparator.comparing(Team::getTeamName));
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            int rankPlace = 1;
            for (Team team : teamList) {
                writer.write(String.format("%d. %s\n",
                        rankPlace++, team.getTeamName()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

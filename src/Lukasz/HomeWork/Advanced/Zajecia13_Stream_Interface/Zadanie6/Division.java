package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie6;

import java.util.*;

public class Division {

    private final String name;
    private final List<Team> teamList;

    public Division(String name, List<Team> teamList) {
        this.name = name;
        this.teamList = teamList;
    }

    public String getName() {
        return name;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    @Override
    public String toString() {
        return "Oddział " + name + "\n" + "Zespół: " + teamList;
    }
}

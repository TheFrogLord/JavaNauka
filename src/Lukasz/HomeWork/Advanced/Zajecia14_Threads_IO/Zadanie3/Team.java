package Lukasz.HomeWork.Advanced.Zajecia14_Threads_IO.Zadanie3;

public class Team {
    private String teamName;
    private int scoreNumber;
    private int againstNumber;
    private int pointSummary;

    public Team(String teamName, String scoreNumber, String againstNumber, String pointSummary) {
        this.teamName = teamName;
        this.scoreNumber = Integer.parseInt(scoreNumber);
        this.againstNumber = Integer.parseInt(againstNumber);
        this.pointSummary = Integer.parseInt(pointSummary);
    }

    public int getScoreBilans() {
        return scoreNumber - againstNumber;
    }

    public int getPointSummary() {
        return pointSummary;
    }

    public String getTeamName() {
        return teamName;
    }
}

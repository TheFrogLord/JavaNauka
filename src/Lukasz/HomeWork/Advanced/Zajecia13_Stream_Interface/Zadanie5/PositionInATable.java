package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie5;

public class PositionInATable {

    private String name;
    private int numberOfPoints;
    private int scoreNumber;
    private int scoreAgainst;

    public PositionInATable(String name, int numberOfPoints, int scoreNumber, int scoreAgainst) {
        this.name = name;
        this.numberOfPoints = numberOfPoints;
        this.scoreNumber = scoreNumber;
        this.scoreAgainst = scoreAgainst;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPoints() {
        return numberOfPoints;
    }

    public int getScoreNumber() {
        return scoreNumber;
    }

    public int getScoreAgainst() {
        return scoreAgainst;
    }

    @Override
    public String toString() {

        return name + " | " + numberOfPoints + " pkt." + " | " +
                + scoreNumber + " zdobyte" + " | " + scoreAgainst + " stracone" +"\n";

    }
}

package Lukasz.SDA_Advanced.zajecia14.NewIO.Zadanie3;

public class Candidate {
    private String firstName;
    private String lastName;
    private int mathExamResult;
    private int englishExamResult;

    public Candidate(String firstName, String lastName, String mathExamResult, String englishExamResult) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mathExamResult = Integer.parseInt(mathExamResult);
        this.englishExamResult = Integer.parseInt(englishExamResult);
    }

    public double getAverageExamResult() {
        return (double) (mathExamResult + englishExamResult) / 2;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMathExamResult() {
        return mathExamResult;
    }

    public int getEnglishExamResult() {
        return englishExamResult;
    }

}

package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie4;

import java.util.List;

public class Candidate {

    private String nameAndSurname;
    private List<String> knownTechnology;
    private String education;
    private int earsOfExperience;

    public Candidate(String nameAndSurname, List<String> knownTechnology, String education, int earsOfExperience) {
        this.nameAndSurname = nameAndSurname;
        this.knownTechnology = knownTechnology;
        this.education = education;
        this.earsOfExperience = earsOfExperience;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public List<String> getKnownTechnology() {
        return knownTechnology;
    }

    public String getEducation() {
        return education;
    }

    public int getEarsOfExperience() {
        return earsOfExperience;
    }

    @Override
    public String toString() {
        return "Imię i Nazwisko: " + nameAndSurname + "\n"
                + "Znane technologie: " + knownTechnology + "\n"
                + "Wykształcenie: " + education + "\n"
                + "Doświadczenie: " + earsOfExperience + " lat";
    }
}

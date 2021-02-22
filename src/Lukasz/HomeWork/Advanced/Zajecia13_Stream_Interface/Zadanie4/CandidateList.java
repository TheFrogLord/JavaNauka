package Lukasz.HomeWork.Advanced.Zajecia13_Stream_Interface.Zadanie4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandidateList {

    List<Candidate> candidateList = new ArrayList<>();

    public CandidateList() {
        candidateList.add(new Candidate("Monika Lewinsky",
                Arrays.asList("Java", "Python", "SQL"), "wyższe", 4));
        candidateList.add(new Candidate("Lech Wałęsa",
                Arrays.asList("Power On/OFF", "Shuffle"), "zawodowe", 30));
        candidateList.add(new Candidate("Tomasz Iwan",
                Arrays.asList("Java", "Python", "HTML5", "SQL"), "wyższe", 0));
        candidateList.add(new Candidate("Lech Roch",
                Arrays.asList("Java", "Rhymes"), "wyższe", 7));
        candidateList.add(new Candidate("Papcio Chmiel",
                Arrays.asList("Java", "SQL"), "srednie", 0));
    }

    public List<Candidate> findAll() {
        return candidateList;
    }
}

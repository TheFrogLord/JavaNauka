package Lukasz.SDA_Advanced.zajecia10.Zadanie4_Enum;

public enum TrainingSubject {

    JAVA_PODSTAWY("Java podstawy", 24, "klasy", "pętle", "instrukcje warunkowe"),
    TESTY_JEDNOSTKOWE("Testowanie jednostkowe JUnit", 16, "testy jednostkowe", "Mockito"),
    JAVA_ZAAWANSOWANA("Java zaawansowana", 32, "interfejsy", "kolekcje"),
    SQL("Programowanie baz danych SQL", 16, "zapytania"),
    HIBERNATE("ORM i Hibernate", 8, "encje"),
    SPRING("Frameworki na podstawie Spring", 42, "Spring Core", "Spring Data"),
    PROJEKT_GROUPOWY("Projekt grupowy", 35, "Praca w projekcie");

    private String name;
    private int hours;
    private String[] skills;

    TrainingSubject(String name, int hours, String... skills) {
        this.name = name;
        this.hours = hours;
        this.skills = skills;
    }

    public String getDisplayName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public String[] getSkills() {
        return skills;
    }

    public static TrainingSubject valueByDisplayName(String displayName) {
        for (TrainingSubject subject : values()) {
            if (subject.getDisplayName().equals(displayName)) {
                return subject;
            }
        }
        return null;
    }

}



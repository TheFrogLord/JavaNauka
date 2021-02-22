package Lukasz.SDA_Advanced.zajecia11.Exceptions_Wyjatki.Zadanie1;

public class PeselValidator {

    private String pesel;

    public PeselValidator(String pesel) {
        if (pesel.length() != 11) {
            throw new IndexOutOfBoundsException("Niepoprawny pesel");
        }
        this.pesel = pesel;
    }

    public String getPesel() {
        return this.pesel;
    }

}

package Lukasz.HomeWork.Advanced.Interface_enums.Zadanie1;

public enum Countries {

    PL("Poland - PL", 48),
    FR("France - FR", 33),
    SE("Sweden - SE", 46),
    ES("Spain - ES", 34);

    private final String countrySign;
    private final int number;

    Countries(String countrySign, int number) {
        this.countrySign = countrySign;
        this.number = number;
    }

    public String getCountrySign() {
        return countrySign;
    }

    public int getNumber() {
        return number;
    }
}

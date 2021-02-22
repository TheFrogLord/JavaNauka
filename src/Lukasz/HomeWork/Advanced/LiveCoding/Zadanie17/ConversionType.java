package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie17;

public enum ConversionType {

    METERS_TO_YARDS(new Converter(1.09)),
    YARDS_TO_METERS(new Converter(0.91)),
    CENTIMETERS_TO_ICHES(new Converter(0.3937)),
    INCHES_TO_CENTIMETERS(new Converter(2.54)),
    KILOMETERS_TO_MILES(new Converter(0.62)),
    MILES_TO_KILOMETERS(new Converter(1.609344));

    private final Converter converter;

    ConversionType(Converter converter) {
        this.converter = converter;
    }

    public double getConverter() {
        return converter.getFactor();
    }
}


package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie17;

public class MeasurementConverter {

    public static double convert (int value, ConversionType conversionType) {
        return value * conversionType.getConverter();
    }
}

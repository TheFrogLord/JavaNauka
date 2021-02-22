package Lukasz.HomeWork.Advanced.Exceptions.Zadanie2;

import Lukasz.SDA_Advanced.zajecia11.Exceptions_Wyjatki.Zadanie1.NegativeNumberException;

public class PrzelicznikWalut {

    public static double CurencyCalc(double pln, double euro) {
        if (pln < 0) {
            throw new NegativeNumberException();
        }
        return pln * euro;

    }
}

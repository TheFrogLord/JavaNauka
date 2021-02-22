package Lukasz.HomeWork.Advanced.Interface_enums.Zadanie2;

public enum Math {
    SUM(),
    SUBSEQUENCE(),
    MULTIPLY(),
    DIVIDE();

    MathOperations sum = new MathOperations() {
        @Override
        public double math(double a, double b) {
            return a + b;
        }
    };

    MathOperations subs = new MathOperations() {
        @Override
        public double math(double a, double b) {
            return a - b;
        }
    };

    MathOperations multi = new MathOperations() {
        @Override
        public double math(double a, double b) {
            return a * b;
        }
    };

    MathOperations div = new MathOperations() {
        @Override
        public double math(double a, double b) {
            return a / b;
        }
    };





}

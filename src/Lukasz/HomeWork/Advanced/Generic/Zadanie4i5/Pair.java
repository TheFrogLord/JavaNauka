package Lukasz.HomeWork.Advanced.Generic.Zadanie4i5;

public class Pair<T, R> {
    private final T one;
    private final R two;

    public Pair(T one, R two) {
        this.one = one;
        this.two = two;
    }

    public T getOne() {
        return one;
    }

    public R getTwo() {
        return two;
    }

    public String showDetails() {
        return getOne() + ": " + getTwo();
    }

    public <T, R>void swapElements() {
        T temp = (T) two;
        R two = (R) one;
        System.out.println(temp + ": " + two);
    }
}

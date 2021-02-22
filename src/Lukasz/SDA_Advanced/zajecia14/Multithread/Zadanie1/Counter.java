package Lukasz.SDA_Advanced.zajecia14.Multithread.Zadanie1;

public class Counter {
    private Integer count;

    public Counter(Integer start) {
        this.count = start;
    }

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public Integer getCount() {
        return count;
    }
}

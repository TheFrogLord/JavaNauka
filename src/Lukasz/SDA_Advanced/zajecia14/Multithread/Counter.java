package Lukasz.SDA_Advanced.zajecia14.Multithread;

public class Counter {
    private Integer count;

    public Counter(Integer start) {
        this.count = start;
    }

    public void increment() {
        System.out.println("Jestem przed wykonaniem duzej operacji");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Jestem po wykonaniu duzej operacji");

        synchronized(count) {
            count++;
        }
    }

    public Integer getCount() {
        return count;
    }

}

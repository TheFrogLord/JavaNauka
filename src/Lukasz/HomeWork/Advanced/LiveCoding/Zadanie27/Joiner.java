package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie27;

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... elements) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < elements.length; i++) {
            if (i == elements.length - 1) {
                sb.append(elements[i]);
            } else {
                sb.append(elements[i]).append(separator);
            }
        }
        return sb.toString();
    }


}

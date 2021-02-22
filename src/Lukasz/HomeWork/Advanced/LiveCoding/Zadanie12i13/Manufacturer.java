package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie12i13;

import java.util.Objects;

public class Manufacturer {

    private String name;
    private long foundedYear;
    private String coutryOfOrigin;

    public Manufacturer(String name, long foundedYear, String coutryOfOrigin) {
        this.name = name;
        this.foundedYear = foundedYear;
        this.coutryOfOrigin = coutryOfOrigin;
    }

    public String getName() {
        return name;
    }

    public long getFoundedYear() {
        return foundedYear;
    }

    public String getCoutryOfOrigin() {
        return coutryOfOrigin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacturer)) return false;
        Manufacturer that = (Manufacturer) o;
        return getFoundedYear() == that.getFoundedYear()
                && getName().equals(that.getName())
                && getCoutryOfOrigin().equals(that.getCoutryOfOrigin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getFoundedYear(),
                getCoutryOfOrigin());
    }

    @Override
    public String toString() {
        return "name: " + name + " | " +
                "foundedYear: " + foundedYear + " | " +
                "coutryOfOrigin: " + coutryOfOrigin;
    }
}

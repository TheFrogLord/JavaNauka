package Lukasz.HomeWork.Advanced.LiveCoding.Zadanie5;

import java.util.Iterator;

public class SDAHashSet<E> extends HashSet {

        private HashSet<E> set;

    public SDAHashSet(HashSet set) {
        this.set = set;
    }

    @Override
    public void add(int value) {

        set.add(value);
    }

    public void displaySet() {

    }
}

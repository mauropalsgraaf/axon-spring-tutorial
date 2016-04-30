package org.mauropalsgraaf.axon.readmodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Persons implements Iterable<Person> {

    private List<Person> persons;

    public Persons() {
        persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    @Override
    public Iterator<Person> iterator() {
        return persons.iterator();
    }
}

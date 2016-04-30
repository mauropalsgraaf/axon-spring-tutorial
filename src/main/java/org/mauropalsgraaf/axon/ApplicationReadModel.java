package org.mauropalsgraaf.axon;

import org.mauropalsgraaf.axon.readmodel.Person;
import org.mauropalsgraaf.axon.readmodel.Persons;
import org.mauropalsgraaf.axon.readmodel.PersonsReadModel;

public class ApplicationReadModel {

    private PersonsReadModel persons;

    public ApplicationReadModel(PersonsReadModel persons) {
        this.persons = persons;
    }

    public void run() {
        Persons persons = this.persons.getAll();

        for (Person person: persons) {
            System.out.print(person.getFirstName());
            System.out.println(" " + person.getLastName());
        }
    }
}

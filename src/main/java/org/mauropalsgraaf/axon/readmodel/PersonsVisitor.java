package org.mauropalsgraaf.axon.readmodel;

import org.axonframework.domain.DomainEventMessage;
import org.axonframework.eventstore.EventVisitor;
import org.mauropalsgraaf.axon.events.PersonAdded;

public class PersonsVisitor implements EventVisitor {

    private Persons persons;

    public PersonsVisitor() {
        persons = new Persons();
    }

    public void doWithEvent(DomainEventMessage domainEventMessage) {
        if (domainEventMessage.getPayloadType() == PersonAdded.class) {
            PersonAdded event = (PersonAdded) domainEventMessage.getPayload();

            persons.add(new Person(
                event.getFirstName(),
                event.getInfix(),
                event.getLastName()
            ));
        }
    }

    public Persons getAllPersons() {
        return persons;
    }
}

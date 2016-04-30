package org.mauropalsgraaf.axon.domainmodel;

import org.axonframework.eventsourcing.annotation.AbstractAnnotatedAggregateRoot;
import org.axonframework.eventsourcing.annotation.AggregateIdentifier;
import org.axonframework.eventsourcing.annotation.EventSourcingHandler;
import org.mauropalsgraaf.axon.domainmodel.PersonAggregate.FirstName;
import org.mauropalsgraaf.axon.domainmodel.PersonAggregate.Infix;
import org.mauropalsgraaf.axon.domainmodel.PersonAggregate.LastName;
import org.mauropalsgraaf.axon.events.PersonAdded;

import java.util.UUID;

public class Person extends AbstractAnnotatedAggregateRoot<UUID> {

    @AggregateIdentifier
    private UUID personId;

    private FirstName firstName;

    private Infix infix;

    private LastName lastName;

    public Person() {

    }

    public Person(
        UUID personId,
        FirstName firstName,
        Infix infix,
        LastName lastName
    ) {
        apply(new PersonAdded(
            personId.toString(),
            firstName.toString(),
            infix.toString(),
            lastName.toString()
        ));
    }

    @Override
    public String toString() {
        return String.format(
            "\nPersonId: %s\nfirstName: %s\ninfix: %s\nlastName: %s}",
            personId,
            firstName,
            infix,
            lastName
            );
    }

    @EventSourcingHandler
    public void personAdded(PersonAdded event) {
        this.personId = UUID.fromString(event.getPersonId());
        this.firstName = new FirstName(event.getFirstName());
        this.infix = new Infix(event.getInfix());
        this.lastName = new LastName(event.getLastName());
    }
}

package org.mauropalsgraaf.axon.repositories;

import org.axonframework.domain.DomainEventStream;
import org.axonframework.eventstore.mongo.MongoEventStore;
import org.axonframework.repository.Repository;
import org.mauropalsgraaf.axon.domainmodel.Person;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class PersonRepository implements Repository<Person> {

    public static final String STREAM_TYPE = "person";

    private MongoEventStore eventStore;

    public PersonRepository(MongoEventStore eventStore) {
        this.eventStore = eventStore;
    }

    public Person load(Object identifier, Long aLong) {
        throw new NotImplementedException();
    }

    public Person load(Object identifier) {
        DomainEventStream occuredEventsOnAggregate = eventStore.readEvents(STREAM_TYPE, identifier);

        Person person = new Person();
        person.initializeState(occuredEventsOnAggregate);

        return person;
    }

    public void add(Person person) {
        eventStore.appendEvents(STREAM_TYPE, person.getUncommittedEvents());
    }
}

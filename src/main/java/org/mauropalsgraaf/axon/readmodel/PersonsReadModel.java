package org.mauropalsgraaf.axon.readmodel;

import org.axonframework.eventstore.mongo.MongoEventStore;

public class PersonsReadModel {

    private MongoEventStore mongoEventStore;

    public PersonsReadModel(MongoEventStore mongoEventStore) {
        this.mongoEventStore = mongoEventStore;
    }

    public Persons getAll() {
        PersonsVisitor visitor = new PersonsVisitor();
        mongoEventStore.visitEvents(visitor);

        return visitor.getAllPersons();
    }
}

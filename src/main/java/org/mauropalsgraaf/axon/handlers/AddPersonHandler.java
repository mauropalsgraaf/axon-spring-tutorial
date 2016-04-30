package org.mauropalsgraaf.axon.handlers;

import org.axonframework.commandhandling.annotation.CommandHandler;
import org.mauropalsgraaf.axon.commands.AddPerson;
import org.mauropalsgraaf.axon.domainmodel.Person;
import org.mauropalsgraaf.axon.domainmodel.PersonAggregate.FirstName;
import org.mauropalsgraaf.axon.domainmodel.PersonAggregate.Infix;
import org.mauropalsgraaf.axon.domainmodel.PersonAggregate.LastName;
import org.mauropalsgraaf.axon.repositories.PersonRepository;

import java.util.UUID;

public class AddPersonHandler {

    private PersonRepository personRepository;

    public AddPersonHandler(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @CommandHandler
    public void handle(AddPerson command) {
        UUID personId = UUID.randomUUID();

        Person person = new Person(
            personId,
            new FirstName(command.getFirstName()),
            new Infix(command.getInfix()),
            new LastName(command.getLastName())
        );

        personRepository.add(person);
    }
}

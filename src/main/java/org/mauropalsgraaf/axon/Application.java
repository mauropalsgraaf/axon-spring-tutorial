package org.mauropalsgraaf.axon;

import org.axonframework.commandhandling.gateway.CommandGateway;
import org.mauropalsgraaf.axon.commands.AddPerson;

public class Application {

    private CommandGateway commandGateway;

    public Application(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    public void run() {
        this.commandGateway.send(new AddPerson("New", null, "Person"));
    }
}

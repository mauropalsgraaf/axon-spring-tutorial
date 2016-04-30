package org.mauropalsgraaf.axon.events;

public class PersonAdded {
    private String personId;
    private String firstName;
    private String infix;
    private String lastName;

    public PersonAdded(String personId, String firstName, String infix, String lastName) {
        this.personId = personId;
        this.firstName = firstName;
        this.infix = infix;
        this.lastName = lastName;
    }

    public String getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getInfix() {
        return infix;
    }

    public String getLastName() {
        return lastName;
    }
}

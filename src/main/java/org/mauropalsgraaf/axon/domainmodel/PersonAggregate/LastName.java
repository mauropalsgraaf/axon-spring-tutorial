package org.mauropalsgraaf.axon.domainmodel.PersonAggregate;

public class LastName {

    private String lastName;

    public LastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return this.lastName;
    }
}

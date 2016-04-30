package org.mauropalsgraaf.axon.domainmodel.PersonAggregate;

public class FirstName {

    private String firstName;

    public FirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return this.firstName;
    }
}

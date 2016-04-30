package org.mauropalsgraaf.axon.domainmodel.PersonAggregate;

public class Infix {

    private String infix;

    public Infix(String infix) {
        this.infix = infix;
    }

    public String getInfix() {
        return infix;
    }

    @Override
    public String toString() {
        return this.infix;
    }
}

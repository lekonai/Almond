package org.acme.parameters;

public class DiscreteParameter extends Parameter {
    @Override
    public float read() {
        // NOT implemented
    }

    @Override
    public void update(Parameter parameter) {
        // Check to make sure type is of DiscreteParameter not just Parameter?
    }
}

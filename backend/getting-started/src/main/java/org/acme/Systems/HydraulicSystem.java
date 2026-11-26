package org.acme.systems;

import org.acme.parameters.ParameterSet;

public class HydraulicSystem extends AbstractSystem {
    @Override
    public ParameterSet step(ParameterSet parameters) {
        // Physics-specific logic

        return buffer;
    }
}

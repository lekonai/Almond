package org.acme.Systems;

import org.acme.Parameters.ParameterSet;

public class HydraulicSystem extends AbstractSystem{
    @Override
    public ParameterSet step(ParameterSet parameters) {
        // Physics-specific logic

        return buffer;
    }
}

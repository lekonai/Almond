package org.acme.Systems;

import org.acme.Parameters.*;

public class InputSystem extends AbstractSystem{
    @Override
    public ParameterSet step(ParameterSet parameters) {
        // Physics-specific logic

        return buffer;
    }
}
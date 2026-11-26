package org.acme;

import org.acme.systems.*;
import java.util.ArrayList;
import java.util.List;
import org.acme.datastores.*;
import org.acme.parameters.*;

public class Simulation {
    Settings settings = Settings.instance;

    List<Field> fields = new ArrayList<>();

    ParameterSet parameters = new ParameterSet();

    // need to fill out with more systems
    AbstractSystem[] systems = {new InputSystem(), new HydraulicSystem()};



    // NOTE do we have step take a specific time frame or let the main class handle that by applying
    // step many times?
    // If we have step take a time, then system.step() also needs to be updated to take a time
    public void step() {
        for (AbstractSystem s : systems) {
            parameters.update(s.step(parameters));
        }
    }
}

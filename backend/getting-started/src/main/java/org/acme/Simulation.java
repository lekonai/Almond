package org.acme;

import org.acme.DataStores.*;
import org.acme.Parameters.*;
import org.acme.Systems.*;

public class Simulation {
    Settings settings = Settings.instance;

    Field[] fields = {};

    ParameterSet parameters = new ParameterSet();

    // need to fill out with more systems
    AbstractSystem[] systems = {
        new InputSystem(),
        new HydraulicSystem()
    };    



    // NOTE do we have step take a specific time frame or let the main class handle that by applying step many times?
    // If we have step take a time, then system.step() also needs to be updated to take a time
    public void step(){
        for (AbstractSystem s : systems){
            parameters.update(s.step(parameters));
        }
    }
}

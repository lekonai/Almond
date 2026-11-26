package org.acme.parameters;

import java.util.Map;
import java.util.Hashtable;


public class ParameterSet {
    Map<String, Parameter> parameters = new Hashtable<>();

    public ParameterSet() {
        parameters.put("Topology", new FlatParameter());
        parameters.put("SurfaceWater", new FlatParameter());
        parameters.put("WaterLevel", new GaussianParameter());
        // NOTE EXTEND...
        // NOTE We should have a standardised way of naming the parameters to avoid confusion
    }


    public Parameter get(String name) {
        // NOTE CHECK IF THE PARAMETER EXISTS FIRST
        return parameters.get(name);
    }

    public void update(String name, Parameter parameter) {

    }

    public void update(ParameterSet parameters) {

    }
}

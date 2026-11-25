package org.acme.Systems;
import org.acme.Parameters.*;

public abstract class AbstractSystem {

    // The buffer for all calculations
    protected ParameterSet buffer = new ParameterSet();

    
    // Function should take a set of input parameters and return what needs to change in the form of ParameterSet
    public abstract ParameterSet step(ParameterSet parameters);    
}

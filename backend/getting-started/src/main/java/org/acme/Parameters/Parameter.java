package org.acme.Parameters;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

import org.acme.DataStores.*;

public abstract class Parameter {

    // Note that the grid is of type INDArray, which comes from java's ND4J (equivalent to NumPy)
    // Keeping grid size consistent by using size stored in settings
    protected Settings settings = Settings.instance;
    protected INDArray grid = Nd4j.zeros(
        settings.x_size, 
        settings.y_size
    );
    protected Uncertainty uncertainty = new Uncertainty(1,0); // NOTE default set to mean 1 and 0 variance. Is this ok???


    public abstract float read();
    public abstract void update(Parameter parameter); // update must update the grid AND uncertainty
    
    public void setUncertainty(Uncertainty uncertainty){
        this.uncertainty = uncertainty;
    }
}

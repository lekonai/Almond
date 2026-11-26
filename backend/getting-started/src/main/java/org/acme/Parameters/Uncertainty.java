package org.acme.parameters;

// NOTE what does uncertainty mean actually mean? Is it the average of all datapoints in the
// parameter? Or the "mean uncertainty"

public class Uncertainty {
    float mean;
    float variance;

    public Uncertainty(float m, float v) {
        this.mean = m;
        this.variance = v;
    }

    public void update(Uncertainty u) {
        combineMean(u.getMean());
        combineVariance(u.getVariance());
    }

    public void combineMean(float m) {
        // combine current mean and other mean
    }

    public void combineVariance(float v) {
        // combine current variance and other variance
    }

    public float getMean() {
        return mean;
    }

    public float getVariance() {
        return variance;
    }
}

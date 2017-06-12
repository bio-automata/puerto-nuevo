package br.edu.ifmg.samuelterra.model.random;

/**
 * Created by samuel on 12/06/17.
 */
public class ExponentialDistribution {

    Double lamb;

    public ExponentialDistribution(Double lamb) {
        this.lamb = lamb;
    }

    public Double getLamb() {
        return lamb;
    }

    public void setLamb(Double lamb) {
        this.lamb = lamb;
    }

}

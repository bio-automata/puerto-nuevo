package br.edu.ifmg.samuelterra.model.random;

/**
 * Created by samuel on 12/06/17.
 */
public class ExponentialDistributionGen{
    Double lamb;
    private Random random;

    public ExponentialDistributionGen(Double lamb, Random random){
        this.lamb = lamb;
        this.random = random;
    }

    public Double getLambda() {
        return this.random.exponential(this.lambda);
    }

    public void setLambda(Double lamb) {
        this.lamb = lamb;
    }
}

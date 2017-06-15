package br.edu.ifmg.samuelterra.model.random;

/**
 * Created by samuel on 12/06/17.
 */
public class ExponentialDistributionGen{
    Double lambda;
    private Random random;

    public ExponentialDistributionGen(Double lambda, Random random){
        this.lambda = lambda;
        this.random = random;
    }

    public Double getLambda() {
        return this.random.exponential(this.lambda);
    }

    public void setLambda(Double lambda) {
        this.lambda = lambda;
    }

    public Double get() {
        return this.random.exponential(this.lambda);
    }
}

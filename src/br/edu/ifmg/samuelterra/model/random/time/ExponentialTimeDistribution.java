package br.edu.ifmg.samuelterra.model.random.time;

import br.edu.ifmg.samuelterra.model.system.Systema;

/**
 * Created by samuel on 12/06/17.
 */
public class ExponentialTimeDistribution extends TimeDistribution{
    Double lambda;

    public ExponentialTimeDistribution(Double lambda, Systema system){
        super(system);
        this.lambda = lambda;
    }

    public double generate() {
        return this.system.random.exponential(this.lambda);
    }
}

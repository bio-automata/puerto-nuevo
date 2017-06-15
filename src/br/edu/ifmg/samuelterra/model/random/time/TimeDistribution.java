package br.edu.ifmg.samuelterra.model.random.time;

import br.edu.ifmg.samuelterra.model.system.Systema;

/**
 * Created by dicus on 15/06/17.
 */
public abstract class TimeDistribution {
    protected Systema system;

    public TimeDistribution(Systema system){
        this.system = system;
    }

    public abstract double generate();
}

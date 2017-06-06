package br.edu.ifmg.samuelterra.model.random;

/**
 * Created by dicus on 28/04/17.
 */
public class Random extends Random{
    private double lambda;

    public double generate(){
        return -(1.0/this.lambda)*Math.log(1.0-this.percentual());
    }
}

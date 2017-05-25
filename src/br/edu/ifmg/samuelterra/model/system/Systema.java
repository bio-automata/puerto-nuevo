package br.edu.ifmg.samuelterra.model.system;

import br.edu.ifmg.samuelterra.model.system.collections.EntityQueueSet;
import br.edu.ifmg.samuelterra.model.system.collections.EntitySet;

import java.util.ArrayList;

/**
    System
 */

public class Systema {
    private double clock;               //system clock
    private EntitySet entitySet;                //conjunto de entidades do sistema
    private EntityQueueSet entityQueueSet;      //conjunto de filas do sistema
    private FutureEventList futureEventList;    //FEL
    private ArrayList<Double> variables;

    public double getClock() {
        return clock;
    }

    public void setClock(double clock) {
        this.clock = clock;
    }

    public void incrementClock(double increment) {
        this.clock = this.clock+increment;
    }

    public EntitySet getEntitySet() {
        return entitySet;
    }

    public void setEntitySet(EntitySet entitySet) {
        this.entitySet = entitySet;
    }

    public EntityQueueSet getEntityQueueSet() {
        return entityQueueSet;
    }

    public void setEntityQueueSet(EntityQueueSet entityQueueSet) {
        this.entityQueueSet = entityQueueSet;
    }

    public FutureEventList getFutureEventList() {
        return futureEventList;
    }

    public void setFutureEventList(FutureEventList futureEventList) {
        this.futureEventList = futureEventList;
    }


    public void addVariable(double value) {
        this.variables.add(value);
    }

    public Double getVariable(int i) {
        return variables.get(i);
    }

    public ArrayList getVariables() {
        return variables;
    }

    public void setVariable(int i, Double value) {
        this.variables.set(i,value);
    }

    public void setVariables(ArrayList variables) {
        this.variables = variables;
    }
}

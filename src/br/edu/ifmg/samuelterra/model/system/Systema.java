package br.edu.ifmg.samuelterra.model.system;

import br.edu.ifmg.samuelterra.model.system.collections.EntityQueueSet;
import br.edu.ifmg.samuelterra.model.system.collections.EntitySet;

/**
    System
 */

public class Systema {
    private double clock;               //system clock
    EntitySet entitySet;                //conjunto de entidades do sistema
    EntityQueueSet entityQueueSet;      //conjunto de filas do sistema
    FutureEventList futureEventList;    //FEL

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
}

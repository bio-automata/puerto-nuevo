package br.edu.ifmg.samuelterra.model.system;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.system.collections.EntityQueueSet;
import br.edu.ifmg.samuelterra.model.system.collections.EntitySet;

import java.util.HashMap;
import java.util.Map;

/**
    Systema

    entities:

    wharf
    equip
    cranes

    ships



 */

public class Systema {

    // Tablea hash com as variaveis de entrada do sistema
    private Map<Integer,Double> variables = new HashMap<>();

    private double clock;                       //relógio do sistema
    private EntitySet entitySet;                //conjunto de entidades do sistema
    private EntityQueueSet entityQueueSet;      //conjunto de filas do sistema
    private FutureEventList futureEventList;    //FEL

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

    public void agendFutureEvent(Event envent) {
        this.futureEventList.addEvent(envent);
    }

    public FutureEventList getNextImediateEvent() {
        return futureEventList;
    }

    public FutureEventList getFutureEventList() {
        return futureEventList;
    }

    public void setFutureEventList(FutureEventList futureEventList) {
        this.futureEventList = futureEventList;
    }

    /* Metodos para manipular as variaveis de entrada */
    public void setVariable(Integer variable, Double value){
        this.variables.put(variable, value);
    }

    public Double getVariable(Integer variable){
        if (this.variables.containsKey(variable)){
            return this.variables.get(variable);
        }

        return null;
    }

}

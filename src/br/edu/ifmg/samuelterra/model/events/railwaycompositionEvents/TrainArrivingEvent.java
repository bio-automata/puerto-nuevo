package br.edu.ifmg.samuelterra.model.events.railwaycompositionEvents;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.random.RandomConstants;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**
 TrainArrivingEvent

 */

public class TrainArrivingEvent extends Event{
    public TrainArrivingEvent(){

    }

    public void execute(Systema system){
        system.setClock(this.getOccurrenceTime());
    }
}
package br.edu.ifmg.samuelterra.model.events.railwaycompositionEvents;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**
 TrainDepartureEvent


 */

abstract public class TrainDepartureEvent extends Event{
    private double occurrenceTime;
    private double durationTime;

    abstract public void execute(Systema system);     //dentro deste método acontecerá a mágica

    public double getOccurrenceTime(){
        return this.occurrenceTime;
    }

    public void setOccurrenceTime(double occurrenceTime){
        this.occurrenceTime= occurrenceTime;
    }

    public double getDurationTime(){
        return this.durationTime;
    }

    public void setTimeDistribuition(double duration){
        this.durationTime = duration;
    }
}
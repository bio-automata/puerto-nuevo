package br.edu.ifmg.samuelterra.model.events;

import java.util.ArrayList;

/**
 * Created by dicus on 28/04/17.
 */
abstract public class EventNotice {
    /*
        um event notice será uma ficha contendo



    */

    private double occurrenceTime;
    private double duration;
    private ArrayList<EventNotice> dispachedEvents;           //os eventos desencadeados pela conclusão do evento


    abstract public void consume();

    abstract public void eventDispach();

    public double getOccurrenceTime(){
        return this.occurrenceTime;
    }

    public void setOccurrenceTime(double occurrenceTime){
        this.occurrenceTime= occurrenceTime;
    }

    public double getDuration(){
        return this.duration;
    }

    public void setTimeDistribuition(double duration){
        this.duration = duration;
    }

    public ArrayList<EventNotice> getDispachedEvent(){
        return this.dispachedEvents;
    }

    public EventNotice getDispachedEvent(int i){
        return this.dispachedEvents.get(i);
    }

    public void addDispachedEvent(EventNotice event){
        this.dispachedEvents.add(event);
    }

    public void addDispachedEvent(int i, EventNotice event){
        this.dispachedEvents.add(i, event);
    }
}
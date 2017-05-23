package br.edu.ifmg.samuelterra.model.events;

import java.util.ArrayList;

/**
 * Created by dicus on 28/04/17.
 */
abstract public class Event {

    private int id;
    private double occurrenceTime;
    private double duration;
    private ArrayList<Event> dispachedEvents;           //os eventos desencadeados pela conclusão do evento


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

    public ArrayList<Event> getDispachedEvent(){
        return this.dispachedEvents;
    }

    public Event getDispachedEvent(int i){
        return this.dispachedEvents.get(i);
    }

    public void addDispachedEvent(Event event){
        this.dispachedEvents.add(event);
    }

    public void addDispachedEvent(int i, Event event){
        this.dispachedEvents.add(i, event);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
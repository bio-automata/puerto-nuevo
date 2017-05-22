package br.edu.ifmg.samuelterra.model.events;

import java.util.ArrayList;

/**
 * Created by dicus on 28/04/17.
 */
abstract public class EventNote {
    /*
        event notice será uma ficha contendo
        tempo de ocorrência
        tempo de dureção (progressão temporal)
        outros eventos ocasionados pelo termino deste evento
        requisitos, de qual fila de entidades tomará recursos
        requisitos, de qual fila de entidades tomará recursos

    */

    private double occurrenceTime;
    private double duration;
    private ArrayList<EventNote> dispachedEvents;           //os eventos desencadeados pela conclusão do evento


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

    public ArrayList<EventNote> getDispachedEvent(){
        return this.dispachedEvents;
    }

    public EventNote getDispachedEvent(int i){
        return this.dispachedEvents.get(i);
    }

    public void addDispachedEvent(EventNote event){
        this.dispachedEvents.add(event);
    }

    public void addDispachedEvent(int i, EventNote event){
        this.dispachedEvents.add(i, event);
    }
}
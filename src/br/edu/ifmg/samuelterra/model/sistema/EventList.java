package br.edu.ifmg.samuelterra.model.sistema;

import java.util.ArrayList;

/**
 * Created by dicus on 07/05/17.
 */
public class EventQeue {
    private ArrayList<Event> events;

    public Event getEvent(){
        return this.events.get(0);
    }

    public void addEvent(Event event){

    }
}

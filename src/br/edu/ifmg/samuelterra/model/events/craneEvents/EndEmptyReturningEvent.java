package br.edu.ifmg.samuelterra.model.events.craneEvents;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.random.RandomConstants;
import br.edu.ifmg.samuelterra.model.system.Systema;

import java.util.HashMap;

/**

 */
public class EndEmptyReturningEvent extends Event{

    public EndEmptyReturningEvent(){

    }

    public void execute(Systema system){
        system.setClock(this.getOccurrenceTime());


    }
}

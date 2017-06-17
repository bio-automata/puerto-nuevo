package br.edu.ifmg.samuelterra.model.events.craneEvents;

import br.edu.ifmg.samuelterra.model.entities.Crane;
import br.edu.ifmg.samuelterra.model.entities.ships.Ship;
import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.random.RandomConstants;
import br.edu.ifmg.samuelterra.model.system.Systema;

import java.util.HashMap;

/**

 */
public class EndEmptyReturningEvent extends Event{
    private Crane crane;
    private Ship ship;

    public EndEmptyReturningEvent(Crane crane, Ship ship){
        this.crane = crane;
    }

    public void execute(Systema system){
        system.setClock(this.getOccurrenceTime());


        if(ship.getVariable("container amount")>0){//se existe container no navio

        }
        else{
            if()
        }

    }
}

package br.edu.ifmg.samuelterra.model.events.vehicleEvents;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**
 * Created by dicus on 11/06/17.
 */
public class MovingEmptyCartEvent extends Event{
    public void execute(Systema system){
        system.incrementClock(this.getDurationTime());

        //decrementa contaier do navio



        //
    }
}

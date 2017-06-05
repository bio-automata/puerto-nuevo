package br.edu.ifmg.samuelterra.model.events.craneEvents;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**

 */
public class RiseContainerEvent extends Event {
    @Override
    public void execute(Systema system){
        system.incrementClock(this.getDurationTime());

        //decrementa contaier do navio



        //
    }
}

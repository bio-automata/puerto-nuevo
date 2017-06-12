package br.edu.ifmg.samuelterra.model.events.reachSteakerEvents;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**

 */
public class EmptyReturningEvent extends Event {
    @Override
    public void execute(Systema system){
        system.incrementClock(this.getDurationTime());

        //decrementa contaier do navio



        //
    }
}

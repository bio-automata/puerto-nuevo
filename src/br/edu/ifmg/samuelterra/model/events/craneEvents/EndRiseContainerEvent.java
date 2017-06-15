package br.edu.ifmg.samuelterra.model.events.craneEvents;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.events.equipEvents.EndUndockingEvent;
import br.edu.ifmg.samuelterra.model.random.RandomConstants;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**

 */
public class EndRiseContainerEvent extends Event{
    public EndRiseContainerEvent(){

    }

    @Override
    public void execute(Systema system){
        //atualiza o tempo do sistema
        system.setClock(this.getOccurrenceTime());

        Event event = new EndMovingContainerEvent();
        event.setOccurrenceTime(this.getOccurrenceTime()+system.getRandomTimeGenerator().getTime("mov. container"));
        system.getFutureEventList().addEvent(event);
    }
}

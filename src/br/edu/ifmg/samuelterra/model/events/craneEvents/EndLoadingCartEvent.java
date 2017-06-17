package br.edu.ifmg.samuelterra.model.events.craneEvents;

import br.edu.ifmg.samuelterra.model.entities.Crane;
import br.edu.ifmg.samuelterra.model.entities.vehicles.Cart;
import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.events.vehicleEvents.EndMovingLoadCartEvent;
import br.edu.ifmg.samuelterra.model.random.RandomConstants;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**

 */
public class EndLoadingCartEvent extends Event{
    private Crane crane;
    private Cart cart;

    public EndLoadingCartEvent(Crane crane, Cart cart){
        this.crane = crane;
        this.cart = cart;
    }

    public void execute(Systema system){
    	//atualisa o relógio do sistema
        system.setClock(this.getOccurrenceTime());


        Event event = new EndEmptyReturningEvent(crane);
        event.setOccurrenceTime(this.getOccurrenceTime()+system.getRandomTimeGenerator().getTime("EmptyReturning"));
        system.getFutureEventList().addEvent(event);

        event = new EndMovingLoadCartEvent(cart);
        event.setOccurrenceTime(this.getOccurrenceTime()+system.getRandomTimeGenerator().getTime("MovingLoadCart"));
        system.getFutureEventList().addEvent(event);
    }
}

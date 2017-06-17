package br.edu.ifmg.samuelterra.model.events.vehicleEvents;

import br.edu.ifmg.samuelterra.model.entities.vehicles.Cart;
import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.events.craneEvents.EndEmptyReturningEvent;
import br.edu.ifmg.samuelterra.model.random.RandomConstants;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**
 * Created by dicus on 11/06/17.
 */
public class EndMovingLoadCartEvent extends Event{
    private Cart cart;
    public EndMovingLoadCartEvent(Cart cart){
        this.cart = cart;
    }

    public void execute(Systema system){
        system.setClock(this.getOccurrenceTime());

        if (system.getEntityQueueSet().getEntityQueue("RTG").available()){

        }
        else if (system.getEntityQueueSet().getEntityQueue("reach").available()){

        }
        else{
            system.getEntityQueueSet().addEntity("cart waiting unload", cart);
        }

    }
}

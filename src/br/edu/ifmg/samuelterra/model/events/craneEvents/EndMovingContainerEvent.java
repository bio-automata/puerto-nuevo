package br.edu.ifmg.samuelterra.model.events.craneEvents;

import br.edu.ifmg.samuelterra.model.entities.Crane;
import br.edu.ifmg.samuelterra.model.entities.vehicles.Cart;
import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.random.RandomConstants;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**

 */
public class EndMovingContainerEvent extends Event{
    private Crane crane;
    private Cart cart;


    public EndMovingContainerEvent(){
        this.crane = crane;
        this.cart = cart;
    }

    public void execute(Systema system, Crane crane){
        //atualiza o tempo do sistema
        system.setClock(this.getOccurrenceTime());

        if (system.getEntityQueueSet().getEntityQueue("cart").available()){
            Cart cart = (Cart) system.getEntityQueueSet().getEntity("cart");

            Event event = new EndLoadingCartEvent(this.crane, this.cart);
            event.setOccurrenceTime(this.getOccurrenceTime()+system.getRandomTimeGenerator().getTime("loading cart"));
            system.getFutureEventList().addEvent(event);
        }
        else{
            system.getEntityQueueSet().addEntity("crane waiting cart", crane);
        }
    }
}

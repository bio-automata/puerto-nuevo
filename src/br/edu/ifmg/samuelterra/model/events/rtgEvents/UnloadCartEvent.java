package br.edu.ifmg.samuelterra.model.events.rtgEvents;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.random.RandomConstants;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**
 * Created by dicus on 11/06/17.
 */
public class UnloadCartEvent extends Event{
    public UnloadCartEvent(double a, double b, double c){
        this.distribution = RandomConstants.TRIANGULAR;

        this.distributionParams.put("a",a);
        this.distributionParams.put("b",b);
        this.distributionParams.put("c",c);
    }

    public void execute(Systema system){
        system.incrementClock(this.getDurationTime());

        //decrementa contaier do navio



        //
    }
}

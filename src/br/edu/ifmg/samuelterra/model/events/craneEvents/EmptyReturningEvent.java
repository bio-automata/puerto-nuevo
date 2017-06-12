package br.edu.ifmg.samuelterra.model.events.craneEvents;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.random.RandomConstants;
import br.edu.ifmg.samuelterra.model.system.Systema;

import java.util.HashMap;

/**

 */
public class EmptyReturningEvent extends Event{

    public EmptyReturningEvent(double a,double b,double c){
        this.distribution = RandomConstants.TRIANGULAR;

        this.distributionParams.put("a",a);
        this.distributionParams.put("b",b);
        this.distributionParams.put("c",c);
    }

    @Override
    public void execute(Systema system){
        system.setClock(this.getDurationTime());


    }
}

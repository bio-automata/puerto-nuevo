package br.edu.ifmg.samuelterra.model.events.reachSteakerEvents;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.random.RandomConstants;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**
 * Created by dicus on 11/06/17.
 */
public class MovingContainerToStackEvent extends Event{
    public MovingContainerToStackEvent(double a, double b, double c){
        this.distribution = RandomConstants.TRIANGULAR;

        this.distributionParams.put("a",a);
        this.distributionParams.put("b",b);
        this.distributionParams.put("c",c);
    }

    public void execute(Systema system){
        system.setClock(this.getDurationTime());
    }
}

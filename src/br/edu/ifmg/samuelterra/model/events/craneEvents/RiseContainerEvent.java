package br.edu.ifmg.samuelterra.model.events.craneEvents;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.random.RandomConstants;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**

 */
public class RiseContainerEvent extends Event{
    public RiseContainerEvent(double a, double b, double c){
        this.distribution = RandomConstants.TRIANGULAR;

        this.distributionParams.put("a",a);
        this.distributionParams.put("b",b);
        this.distributionParams.put("c",c);
    }

    @Override
    public void execute(Systema system){
    	//atualisa o relógio do sistema
        //system.setClock(this.getOcorrenceTime());

        //altera váriaveis do sistema e das entidades
        //decrementa contaier do navio

    	//sorteia a duração dos eventos desencadeados
		//agenda na FEL os eventos desencadeados
        //system.agendFutureEvent(event);
    }
}

package br.edu.ifmg.samuelterra.model.events.shipEvents;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.random.RandomConstants;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**

 Event

 é uma classe abstrata para a representação de
 uma corrência de um determinado evento
 lembrando:

 um evento manipulará as filas de entidades do sistema
 um evento manipulará as filas de evento do sistema


 um evento possui:

 tempo de ocorrência
 tempo de duração (progressão temporal)
 poderá ou não desencadear outros eventos


 através do método execute() o evento manipula:

 a lista de eventos do sistema
 o conjunto de entidades do sistema
 as variáveis internas do sistema
 as variáveis internas de uma entidade


 o método execute() seguirá a seguinte ordem:

 alterar o estado das filas do sistema
 alterar as variáveis do sistema
 alterar o estado de estidades
 inserir eventos desencadeados na lista de eventos do sistema

 */

abstract public class ShipArrivingEvent extends Event {
    //exponencial
    public ShipArrivingEvent(double lambda){
        this.distribution = RandomConstants.EXPOENENTIAL;
        this.distributionParams.put("lambda",lambda);
    }

    public void execute(Systema system){
    	system.setClock(this.getDurationTime());
    	//sorteia o tipo do navio

    	//quantidade de containers entre 70 e 100 percent


    	//verifica cais e equipe disponíveis
    	if(){
    		//reserva cais e equipe


    		//sorteia duração do atracamento

    		//agenda na fel evento de fim de atracamento

    	}
    	else{
    		//entra em fila de espera

    	}

    }
}
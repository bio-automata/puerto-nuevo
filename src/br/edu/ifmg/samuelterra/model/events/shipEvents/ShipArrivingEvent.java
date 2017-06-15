package br.edu.ifmg.samuelterra.model.events.shipEvents;

import br.edu.ifmg.samuelterra.ContainerShipFactory;
import br.edu.ifmg.samuelterra.model.entities.Equip;
import br.edu.ifmg.samuelterra.model.entities.Quay;
import br.edu.ifmg.samuelterra.model.entities.ships.Ship;
import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.random.Random;
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

    }

    public void execute(Systema system){
    	system.setClock(this.getOccurrenceTime());

        //sorteia o tipo do navio
        Ship ship = ContainerShipFactory.create((int)new Random().uniform(7));

        //sorteia a quantidade de containers entre 70 e 100 percent
        ship.setNumeberOfContainers((int)(ship.getMaximumCapacity()*(70+new Random().uniform(30)/100)));

    	//verifica cais e equipe disponíveis
    	if(system.getEntityQueueSet().getEntityQueue("quay").available()&&system.getEntityQueueSet().getEntityQueue("equip").available()){
    		//reserva cais e equipe
            Equip equip = (Equip) system.getEntityQueueSet().getEntity("equip");
            Quay quay = (Quay) system.getEntityQueueSet().getEntity("quay");

    		//sorteia duração do atracamento

    		//agenda na fel evento de fim de atracamento


            //system.getFutureEventList().addEvent(Event);
    	}
    	else{
    		//entra em fila de espera
            system.getEntityQueueSet().addEntity("ship waiting docking", ship);
    	}

    }
}
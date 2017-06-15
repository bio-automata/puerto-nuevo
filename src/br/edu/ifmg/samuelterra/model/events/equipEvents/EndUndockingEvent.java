package br.edu.ifmg.samuelterra.model.events.equipEvents;

import br.edu.ifmg.samuelterra.model.entities.Equip;
import br.edu.ifmg.samuelterra.model.entities.Quay;
import br.edu.ifmg.samuelterra.model.entities.ships.Ship;
import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.system.Systema;

/**
 TrainArrivingEvent

 */

public class EndUndockingEvent extends Event{
    public EndUndockingEvent(){

    }

    public void execute(Equip equip, Systema system){
        /** ainda preceisa ser implementado
            o que está aqui foi coopiadao de outra calsse
         */

        //verifica cais e equipe disponíveis
        system.setClock(this.getOccurrenceTime());


        //navio para atracar e cais dsiponível
        if(system.getEntityQueueSet().getEntityQueue("ship waiting dock").available()&&system.getEntityQueueSet().getEntityQueue("quay").available()){
            //retira navio e reserva cais
            Ship ship  = (Ship) system.getEntityQueueSet().getEntity("ship waiting dock");
            Quay quay = (Quay) system.getEntityQueueSet().getEntity("quay");

            /* agendando na FEL um evento de fim de atracamento

               cria o novo evento
               setando seus paramêtros
               e estabelece o tempo de ocorrencia
               com base no tempo atual
               + o sorteio da duração do atracamento
            */


            Event event = new EndUndockingEvent();
            event.setOccurrenceTime(this.getOccurrenceTime()+system.getRandomTimeGenerator().getTime("docking"));
            system.getFutureEventList().addEvent(event);
        }
        else if (system.getEntityQueueSet().getEntityQueue("ship waiting undock").available()){
            //retira navio
            Ship ship  = (Ship) system.getEntityQueueSet().getEntity("ship waiting undock");

            Event event = new EndUndockingEvent();
            event.setOccurrenceTime(this.getOccurrenceTime()+system.getRandomTimeGenerator().getTime("docking"));
            system.getFutureEventList().addEvent(event);

        }
        else{
            //entra em fila de espera
            system.getEntityQueueSet().addEntity("equip", equip);
        }

    }
}

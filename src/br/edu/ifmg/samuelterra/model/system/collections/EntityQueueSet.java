package br.edu.ifmg.samuelterra.model.system.collections;

import br.edu.ifmg.samuelterra.model.entities.Entity;
import br.edu.ifmg.samuelterra.model.system.collections.EntityList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 EntityQueueSet is an abstraction model for a set
 of all system's queues

 Each queue is an especial form of an EntityList
 */

public class EntityQueueSet {

    // hash table que representa o conjunto de filas
    private Map<Integer, EntityList> entityQueue;

    // contrutor
    public EntityQueueSet(){
        this.entityQueue = new HashMap<>();
    }

    // adiciona a entidade em determinada fila, se a entidade nao existir, cria uma nova
    public void addEntity(Integer queue, Entity entity){

        // verifica se existe a fila
        if (this.entityQueue.containsKey(queue)){
            this.entityQueue.get(queue).addEntity(entity);
        }else{
            // adciona uma fila nova e ja adiciona a entity
            this.entityQueue.put(queue, new EntityList(EntityList.QUEUE));
            this.entityQueue.get(queue).addEntity(entity);
        }
    }

    // retorna uma entidade da frente da fila de determinada tipo de entidade (ex. navio, equipe)
    public Entity getEntity(int queue){
        if (this.entityQueue.containsKey(queue)){
            return this.entityQueue.get(queue).getEntity();
        }
        return null;
    }

    // retorna uma lista de entidades
    public EntityList getEntityQueue(int queue){
        return this.entityQueue.get(queue);
    }
}

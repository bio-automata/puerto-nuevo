package br.edu.ifmg.samuelterra.model.system;

import br.edu.ifmg.samuelterra.model.entities.Entity;

import java.util.ArrayList;

/**
 EntityQueueSet is an abstraction model for a set
 of all system's queues

 Each queue is an especial form of an EntityList
 */

public class EntityQueueSet {
    private ArrayList<EntityList> entityQueue;

    public EntityQueueSet(){
        this.entityQueue = new ArrayList<>();
    }

    public void addEntity(int queue, Entity entity){
        this.entityQueue.get(queue).addEntity(entity);
    }

    public Entity getEntity(int queue){
        return this.entityQueue.get(queue).getEntity();
    }

    public void addEntityQueue(){
        this.entityQueue.add(new EntityList(EntityList.QUEUE));
    }

    public void addEntityQueue(int i){
        this.entityQueue.add(i,new EntityList(EntityList.QUEUE));
    }

    public EntityList getEntityQueue(int i){
        return this.entityQueue.get(i);
    }
}

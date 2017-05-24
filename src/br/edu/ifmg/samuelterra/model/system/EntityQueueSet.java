package br.edu.ifmg.samuelterra.model.system;

import br.edu.ifmg.samuelterra.model.entities.Entity;

import java.util.ArrayList;

/**
 EntityQueueSet is an abstraction model for a set
 of all system's queues

 Each queue is an especial form of an EntityList
 */

public class EntityQueue{
    private ArrayList<EntityList> entityQueue;

    public EntityQueue(){
        this.entityQueue = new ArrayList<>();
    }

    public void addEntity(int i, Entity entity){
        this.entityQueue.get(i).addEntity(entity);
    }

    public Entity getEntity(int i){
        return this.entityQueue.get(i).getEntity();
    }

    public void addEntityList(){
        this.entityQueue.add(new EntityList(EntityList.QUEUE));
    }

    public void addEntityList(int i){
        this.entityQueue.add(i,new EntityList(EntityList.QUEUE));
    }

    public EntityList getEntityList(int i){
        return this.entityQueue.get(i);
    }
}

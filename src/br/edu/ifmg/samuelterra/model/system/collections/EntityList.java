package br.edu.ifmg.samuelterra.model.system.collections;

import br.edu.ifmg.samuelterra.model.entities.Entity;

import java.util.ArrayList;

/**
    EntityList

    this is a data structure designed for store
    consumable entity items, in other words,
    once an item was accessed by the get method
    it is purged from the entity list.
 */

public class EntityList {
    public static int LIST = 0;
    public static int QUEUE = 1;
    public static int STACK = 2;

    private int policy;
    private ArrayList<Entity> entityList;

    public EntityList(){
        this.policy = this.LIST;
        this.entityList = new ArrayList<>();
    }

    public EntityList(int policy){
        this.policy = policy;
        this.entityList = new ArrayList<>();
    }

    public void addEntity(Entity entity){
        this.entityList.add(entity);
    }

    public void addEntity(int i, Entity entity){
        if(this.policy==this.LIST){
            this.entityList.add(i, entity);
        }
    }

    public Entity getEntity(){
        if(this.policy==this.STACK){
            return this.unstack();
        }
        else{
            return this.dequeue();
        }
    }

    public Entity getEntity(int i){
        if(this.policy==this.LIST){
            Entity entity = this.entityList.get(i);
            this.entityList.remove(i);
            return entity;
        }
        else if(this.policy==this.QUEUE){
            return this.dequeue();
        }
        else if(this.policy==this.STACK){
            return this.unstack();
        }
        return null;
    }

    private Entity dequeue(){
        Entity entity = this.entityList.get(0);
        this.entityList.remove(0);
        return entity;
    }
    private Entity unstack(){
        Entity entity = this.entityList.get(this.entityList.size()-1);
        this.entityList.remove(this.entityList.size()-1);
        return entity;
    }
}

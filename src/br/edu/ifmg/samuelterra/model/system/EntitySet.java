package br.edu.ifmg.samuelterra.model.system;

import br.edu.ifmg.samuelterra.model.entities.Entity;

import java.util.ArrayList;

/**
 EntitySet is a class to group all system's entities in a
 set of entities collections

 */

public class EntitySet {
    private ArrayList<EntityCollection> entitySet;

    public EntitySet(){
        this.entitySet = new ArrayList<>();
    }

    public void addCollection (EntityCollection collection){
        this.entitySet.add(collection);
    }
    public void addEntity(int collection, Entity entity){
        this.getCollection(collection).addEntity(entity);
    }

    public EntityCollection getCollection (int i){
        return this.entitySet.get(i);
    }
    public Entity getEntity(int collection, int i){
        return this.getCollection(collection).getEntity(i);
    }

    public void destroyCollection(int i){
        this.entitySet.remove(i);
    }
    public void destroyEntity(int collection, int i){
        this.getCollection(collection).destroyEntity(i);
    }
}

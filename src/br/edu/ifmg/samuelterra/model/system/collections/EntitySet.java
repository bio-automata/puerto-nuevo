package br.edu.ifmg.samuelterra.model.system.collections;

import br.edu.ifmg.samuelterra.model.entities.Entity;
import br.edu.ifmg.samuelterra.model.system.collections.EntityCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 EntitySet is a class to group all system's entities
 in a set of entities collections
 */

public class EntitySet {
    private Map<String,EntityCollection> entitySet;

    public EntitySet(){
        this.entitySet = new HashMap<>();
    }

    public void addCollection (String key, EntityCollection collection){
        this.entitySet.put(key,collection);
    }

    public void addEntity(String key, Entity entity){
        this.getCollection(key).addEntity(entity);
    }

    public EntityCollection getCollection (String key){
        return this.entitySet.get(key);
    }
    public Entity getEntity(String key, int i){
        return this.getCollection(key).getEntity(i);
    }

    public void destroyCollection(int i){
        this.entitySet.remove(i);
    }
    public void destroyEntity(String key, int i){
        this.getCollection(key).destroyEntity(i);
    }
}

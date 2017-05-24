package br.edu.ifmg.samuelterra.model.sistema;

import br.edu.ifmg.samuelterra.model.entities.Entity;

import java.util.ArrayList;

/**
 * Created by dicus on 07/05/17.
 */
public class EntitySet {
    private ArrayList<EntityCollection> entitySet;

    public EntitySet(){
        this.entitySet = new ArrayList<>();
    }

    public void addEntity(EntityCollection collection){
        this.entitySet.add(collection);
    }

    public EntityCollection getEntity(int i){
        return this.entitySet.get(i);
    }

    public void destroyEntity(int i){
        this.entitySet.remove(i);
    }
}

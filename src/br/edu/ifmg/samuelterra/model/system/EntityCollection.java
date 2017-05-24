package br.edu.ifmg.samuelterra.model.sistema;

import br.edu.ifmg.samuelterra.model.entities.Entity;

import java.util.ArrayList;

/**
 * Created by dicus on 07/05/17.
 */
public class EntityCollection {
    private ArrayList<Entity> entitySet;

    public EntityCollection(){
        this.entitySet = new ArrayList<>();
    }

    public void addEntity(Entity entity){
        this.entitySet.add(entity);
    }

    public Entity getEntity(int i){
        return this.entitySet.get(i);
    }

    public Entity destroyEntity(int i){
        return this.entitySet.remove(i);
    }
}

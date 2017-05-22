package br.edu.ifmg.samuelterra.model.sistema;

import br.edu.ifmg.samuelterra.model.entities.Entity;

import java.util.ArrayList;

/**
 * Created by dicus on 07/05/17.
 */
public class EntitySet {
    private ArrayList<Entity> entityQueue;

    public EntitySet(){
        this.entityQueue = new ArrayList<>();
    }

    public void addEntity(Entity entity){
        this.entityQueue.add(entity);
    }

    public Entity getEntity(){
        return this.entityQueue.get(0);
    }
}

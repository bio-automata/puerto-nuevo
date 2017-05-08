package br.edu.ifmg.samuelterra.model.Base;

import br.edu.ifmg.samuelterra.model.Base.Entity;

import java.util.ArrayList;

/**
 * Created by dicus on 07/05/17.
 */
public class Queue {
    private ArrayList<Entity> entities;

    public Entity getEntity(){
        return this.entities.get(0);
    }

    public void addEntity(Entity entity){
        this.entities.add(entity);
    }
}

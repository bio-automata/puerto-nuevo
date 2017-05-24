package br.edu.ifmg.samuelterra.model.system.collections;

import br.edu.ifmg.samuelterra.model.entities.Entity;

import java.util.ArrayList;

/**


 */
public class EntityCollection {
    private ArrayList<Entity> entityCollection;

    public EntityCollection(){
        this.entityCollection = new ArrayList<>();
    }

    public void addEntity(Entity entity){
        this.entityCollection.add(entity);
    }

    public Entity getEntity(int i){
        return this.entityCollection.get(i);
    }

    public Entity destroyEntity(int i){
        return this.entityCollection.remove(i);
    }
}
package br.edu.ifmg.samuelterra.model.entities;

/**
 * Created by dicus on 07/05/17.
 */
public class Entity {
    // true  = estidade livre
    // false = estidade ocupada
    private Boolean status;

    private Boolean getStatus() {
        return status;
    }

    private void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean isFree(){
        return getStatus();
    }

    public void lock(){
        this.status = false;
    }

    public void unlock(){
        this.status = true;
    }
}

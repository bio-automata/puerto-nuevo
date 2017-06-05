package br.edu.ifmg.samuelterra.model.entities.ships;

import br.edu.ifmg.samuelterra.model.entities.Entity;

/**
 * Created by samuel on 13/03/17.
 */
public abstract class Ship extends Entity {

    private String name;
    private String description;
    private Double minimumCapacity;
    private Double maximumCapacity;
    private Double length;
    private Double largura;
    private Double draftShip;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getMinimumCapacity() {
        return minimumCapacity;
    }

    public void setMinimumCapacity(Double minimumCapacity) {
        this.minimumCapacity = minimumCapacity;
    }

    public Double getMaximumCapacity() {
        return maximumCapacity;
    }

    public void setMaximumCapacity(Double maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getDraftShip() {
        return draftShip;
    }

    public void setDraftShip(Double draftShip) {
        this.draftShip = draftShip;
    }
}

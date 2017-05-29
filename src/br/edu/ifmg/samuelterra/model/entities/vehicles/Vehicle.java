package br.edu.ifmg.samuelterra.model.entities.vehicles;

import br.edu.ifmg.samuelterra.model.entities.Entity;

/**


 */
public class Vehicle extends Entity {
    private int transported_containers;    //numero de containers carregados
    private double work_units;           //unidades de trabalho (em horas, dias, etc)

    public int getTransported_containers() {
        return transported_containers;
    }

    public void incrementTransported_containers(int transported_containers) {
        this.transported_containers++;
    }

    public double getWork_units() {
        return work_units;
    }

    public void setWork_units(double work_units) {
        this.work_units = work_units;
    }

    public void incrementWork_units(double increment) {
        this.work_units = this.work_units+increment;
    }
}

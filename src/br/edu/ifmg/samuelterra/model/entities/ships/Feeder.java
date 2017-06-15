package br.edu.ifmg.samuelterra.model.entities.ships;

import br.edu.ifmg.samuelterra.model.random.Random;

/**
 * Created by samuel on 13/03/17.
 */
public class Feeder extends Ship {

    public Feeder() {
        this.setName("Feedder");
        this.setDescription("");
        this.setMinimumCapacity(1001.0);
        this.setMaximumCapacity(2000.0);
    }
}

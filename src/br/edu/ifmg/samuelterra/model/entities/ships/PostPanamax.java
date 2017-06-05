package br.edu.ifmg.samuelterra.model.entities.ships;

/**
 * Created by samuel on 13/03/17.
 */
public class PostPanamax extends Ship {

    public PostPanamax() {
        setName("Post Panamax");
        setDescription("");
        setMinimumCapacity(5.101);
        setMaximumCapacity(10000.0);
        setLength(366.0);
        setLargura(49.0);
        setDraftShip(15.2);
    }
}

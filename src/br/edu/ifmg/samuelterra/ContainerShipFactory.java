package br.edu.ifmg.samuelterra;

import br.edu.ifmg.samuelterra.model.entities.ships.*;

/**
 * Created by samuel on 13/03/17.
 */
public class ContainerShipFactory {

    public static final int FEEDER       = 0;
    public static final int FEEDER_MAX   = 1;
    public static final int NEW_PANAMAX  = 2;
    public static final int PANAMAX      = 3;
    public static final int POST_PANAMAX = 4;
    public static final int SMALL_FEEDER = 5;
    public static final int ULTRA_LARGE  = 6;

    public static Ship create(int tipo){

        if (tipo == FEEDER)
            return new Feeder();
        else if (tipo == FEEDER_MAX)
            return  new FeederMax();
        else if (tipo == NEW_PANAMAX)
            return new NewPanamax();
        else if (tipo == PANAMAX)
            return new Panamax();
        else if (tipo == POST_PANAMAX)
            return new PostPanamax();
        else if (tipo == SMALL_FEEDER)
            return new SmallFeeder();
        else if (tipo == ULTRA_LARGE)
            return new UltraLarge();
        else
            throw new IllegalArgumentException("Tipo invalido!");
    }
}

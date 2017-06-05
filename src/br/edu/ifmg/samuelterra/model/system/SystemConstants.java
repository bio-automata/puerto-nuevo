package br.edu.ifmg.samuelterra.model.system;

import br.edu.ifmg.samuelterra.model.events.Event;
import br.edu.ifmg.samuelterra.model.system.collections.EntityQueueSet;
import br.edu.ifmg.samuelterra.model.system.collections.EntitySet;

import java.util.ArrayList;

/**
    Systema

    entities:

    wharf
    equip
    cranes
    ships



 */

public class SystemConstants{

    //system variable names
    public static final int WHARF_QUANTITY  = 0;    // quantidade cais
    public static final int EQUIP_QUANTITY  = 1;    // quantidade equipe
    public static final int CRANE_QUANTITY  = 2;    // quantidade grua
    public static final int CART_QUANTITY   = 3;    // quantidade carreta
    public static final int RTG_QUANTITY    = 4;    // quantidade rtg
    public static final int SHIP_QUANTITY   = 5;    // quantidade navio
    public static final int TRAIN_QUANTITY  = 6;    // quantidade trem

    //entity  names
    public static final int WHARF   = 7;    // entidade cais
    public static final int EQUIP   = 8;    // entidade equipe
    public static final int CRANE   = 9;    // entidade grua
    public static final int CART    = 10;   // entidade carrera
    public static final int RTG     = 11;   // entidade rtg
    public static final int SHIP    = 12;   // entidade navio
    public static final int TRAIN   = 13;   // entidade trem

    public static final int SIMULATION_TIME  = 6;    // quantidade trem


}

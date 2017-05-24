package br.edu.ifmg.samuelterra.model.system;


import br.edu.ifmg.samuelterra.model.system.collections.EntityQueueSet;
import br.edu.ifmg.samuelterra.model.system.collections.EntitySet;

/**
 * Created by dicus on 24/05/17.
 */
public class Systema {
    private double clock;       //system clock
    EntitySet entitySet;        //conjunto de entidades do sistema
    EntityQueueSet entityQueueSet;      //conjunto de filas do sistema
    FutureEventList futureEventList;    //FEL

}

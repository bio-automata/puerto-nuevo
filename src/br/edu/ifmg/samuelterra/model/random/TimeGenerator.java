package br.edu.ifmg.samuelterra.model.random;

import br.edu.ifmg.samuelterra.model.system.Systema;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dicus on 15/06/17.
 */
public class TimeGenerator {
    private Map<String,TimeDistribution> distributions;

    public void TimeGenerator(){
        distributions = new HashMap<>();
    }


    public void addTimeDistribution(String key, TimeDistribution distribution){
        distributions.put(key, distribution);
    }

    public TimeDistribution getTimeDistribution(String key){
        return distributions.get(key);
    }
}
